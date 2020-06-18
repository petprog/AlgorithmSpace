/**
 * Created by Taiwo Farinu on 18-Jun-20
 */

package stacks.using_linked_List;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack {

    private int length;
    private MySinglyLinkedNode top;
    private MySinglyLinkedNode bottom;

    public MyStack() {
        top = null;
        bottom = null;
        length = 0;
    }

    public int peek() {
        if (top != null) {
            return top.getValue();
        } else {
            throw new EmptyStackException();
        }
    }

    public void push(int value) {
        top = new MySinglyLinkedNode(value, top);
        length++;
    }

    public int pop() {
        if (top != null) {
            MySinglyLinkedNode nodeToRemove = top;
            top = nodeToRemove.getNext();
            length--;
            return nodeToRemove.getValue();
        } else {
            bottom.setNext(null);
            throw new EmptyStackException();
        }

    }

    public void printStack() {
        if (top == null) {
            System.out.println("Empty");
            return;
        }
        MySinglyLinkedNode currentNode = top;
        System.out.print(currentNode.getValue());
        currentNode = currentNode.getNext();
        while(currentNode != null) {
            System.out.print("-->" + currentNode.getValue());
            currentNode = currentNode.getNext();
        }
        System.out.println();
        System.out.println("length: " + length);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("pop: " + stack.pop());
        stack.printStack();
        System.out.println("pop: " + stack.pop());
        stack.printStack();
        System.out.println("pop: " + stack.pop());
        stack.printStack();
        System.out.println("peek: " + stack.peek());
        stack.printStack();
        System.out.println("pop: " + stack.pop());
        stack.printStack();

    }


}
