/**
 * Created by Taiwo Farinu on 17-Jun-20
 */

package linkedList_solution.doubly;

import linkedList_solution.singly.MySinglyLinkedNode;

public class MyDoublyLinkedList {

    // tail is the pointer to the last Node
    // head is the pointer to the first Node

    private MyDoublyLinkedNode head;
    private MyDoublyLinkedNode tail;
    private int length;

    public MyDoublyLinkedList(int value) {
        head = new MyDoublyLinkedNode(value);
        tail = head;
        length = 1;
    }

    public void prepend(int value) {
        // beginning insert
        MyDoublyLinkedNode newNode = new MyDoublyLinkedNode(value, null, head);
        head.setPrevious(newNode);
        head = newNode;
        length++;
    }

    public void append(int value) {
        // ending insert
        MyDoublyLinkedNode newNode = new MyDoublyLinkedNode(value, tail, null);
        tail.setNext(newNode);
        tail = newNode;
        length++;
    }

    public void printList() {
        if (head == null) {
            return;
        }
        MyDoublyLinkedNode currentNode = head;
        System.out.print(currentNode.getValue());
        // one transverse
        currentNode = currentNode.getNext();
        while (currentNode != null) {
            System.out.print("<-->" + currentNode.getValue());
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    public void insert(int index, int value) {
        index = wrapIndex(index);
        if (index == 0) {
            prepend(value);
            return;
        }
        if (index == length - 1) {
            append(value);
            return;
        }
        MyDoublyLinkedNode leader = transverseToIndex(index-1);
        MyDoublyLinkedNode follower = leader.getNext();
        MyDoublyLinkedNode newNode = new MyDoublyLinkedNode(value, leader, follower);
        leader.setNext(newNode);
        follower.setPrevious(newNode);
        length++;
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
            return;
        }
        MyDoublyLinkedNode leader = transverseToIndex(index-1);
        MyDoublyLinkedNode nodeToRemove = leader.getNext();
        leader.setNext(nodeToRemove.getNext());
        nodeToRemove.getNext().setPrevious(leader);
        length--;
    }

    private MyDoublyLinkedNode transverseToIndex(int index) {
        index = wrapIndex(index);
        MyDoublyLinkedNode currentNode = head;
        int i = 0;
        while (i < index) {
            currentNode = currentNode.getNext();
            i++;
        }
        return currentNode;
    }

    private int wrapIndex(int index) {
        return Math.max(Math.min(index, length - 1), 0);
    }

    public void reverse() {
        MyDoublyLinkedNode first = head;
        tail = head;
        MyDoublyLinkedNode second = first.getNext();

        for (int i = 0; i < length-1; i++) {
            MyDoublyLinkedNode temp = second.getNext();
            second.setNext(first);
            first = second;
            second = temp;
        }
        head.setNext(null);
        head = first;
    }

    public MyDoublyLinkedNode getHead() {
        return head;
    }

    public MyDoublyLinkedNode getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public static void main(String[] args) {
        MyDoublyLinkedList linkedList = new MyDoublyLinkedList(5);
        linkedList.printList();
        linkedList.append(4);
        linkedList.printList();
        linkedList.prepend(2);
        linkedList.printList();
        linkedList.prepend(4);
        linkedList.printList();
        linkedList.insert(1, 3);
        linkedList.printList();
        linkedList.insert(200, 9);
        linkedList.printList();
        linkedList.reverse();
        System.out.println("-------------------------");
        linkedList.printList();
    }


}
