/**
 * Created by Taiwo Farinu on 18-Jun-20
 */

package queues;

import java.util.EmptyStackException;

public class MyQueue {

    private MySinglyLinkedNode first;
    private MySinglyLinkedNode last;
    private int length;

    public MyQueue() {
        first = null;
        last = null;
        length = 0;
    }

    public int dequeue() {
        if (length == 0) {
            throw new EmptyStackException();
        }
        MySinglyLinkedNode firstNodeToRemove = first;
        first = firstNodeToRemove.getNext();
        length--;
        return firstNodeToRemove.getValue();
    }

    public void enqueue(int value) {
        MySinglyLinkedNode newNode = new MySinglyLinkedNode(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            // last is a pointer to the last object in the queue
            last.setNext(newNode);
            last = newNode;
        }
        length++;
    }

    public int peek() {
        if (length == 0) {
            throw new EmptyStackException();
        }
        return first.getValue();
    }

    public void printList() {
        if (length == 0) {
            return;
        }
        MySinglyLinkedNode currentNode = first;
        System.out.print("first ");
        System.out.print(currentNode.getValue());
        // one transverse
        currentNode = currentNode.getNext();
        while (currentNode != null) {
            System.out.print("--< " + currentNode.getValue());
            currentNode = currentNode.getNext();
        }
        System.out.print(" last");
        System.out.println();
    }

    public static void main(String[] args) {
        MyQueue queues = new MyQueue();
        queues.printList();
        queues.enqueue(2);
        queues.printList();
        queues.enqueue(3);
        queues.printList();
        queues.enqueue(4);
        queues.printList();
        queues.enqueue(4);
        queues.printList();
        queues.enqueue(4);
        queues.printList();
        System.out.println(queues.dequeue());
        queues.printList();
        System.out.println("peek: " + queues.peek());
    }


}
