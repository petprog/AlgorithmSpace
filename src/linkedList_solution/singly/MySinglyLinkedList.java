/**
 * Created by Taiwo Farinu on 17-Jun-20
 */

package linkedList_solution.singly;

import linkedList_solution.doubly.MyDoublyLinkedNode;

public class MySinglyLinkedList {

    private MySinglyLinkedNode head;
    private MySinglyLinkedNode tail;
    private int length;

    public MySinglyLinkedList(int value) {
        head = new MySinglyLinkedNode(value);
        tail = head;
        length = 1;
    }

    public void prepend(int value) {
        // beginning insert
        head = new MySinglyLinkedNode(value, head);
        length++;
    }

    public void append(int value) {
        // ending insert
        MySinglyLinkedNode newNode = new MySinglyLinkedNode(value);
        tail.setNext(newNode);
        tail = newNode;
        length++;
    }

    public void printList() {
        if (head == null) {
            return;
        }
        MySinglyLinkedNode currentNode = head;
        System.out.print(currentNode.getValue());
        // one transverse
        currentNode = currentNode.getNext();
        while (currentNode != null) {
            System.out.print("-->" + currentNode.getValue());
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
        MySinglyLinkedNode pre = transverseToIndex(index-1);
        MySinglyLinkedNode newNode = new MySinglyLinkedNode(value, pre.getNext());
        pre.setNext(newNode);
        length++;
    }

    public void reverse() {
        MySinglyLinkedNode first = head;
        tail = head;
        MySinglyLinkedNode second = first.getNext();

        for (int i = 0; i < length-1; i++) {
            MySinglyLinkedNode temp = second.getNext();
            second.setNext(first);
            first = second;
            second = temp;
        }
        head.setNext(null);
        head = first;
    }

    public void reverse2() {
        if (this.head.getNext() == null) {
            return;
        }
        MySinglyLinkedNode first = head;
        tail = this.head;
        MySinglyLinkedNode second = first.getNext();
        while (second != null) {
            MySinglyLinkedNode temp = second.getNext();
            second.setNext(first);
            first = second;
            second = temp;
        }
        head.setNext(null);
        head = first;
    }

    public void remove(int index) {
        index =  wrapIndex(index);
        if (index == 0) {
            head = head.getNext();
            return;
        }
        MySinglyLinkedNode leader = transverseToIndex(index-1);
        MySinglyLinkedNode nodeToRemove = leader.getNext();
        leader.setNext(nodeToRemove.getNext());
        length--;
    }

    private MySinglyLinkedNode transverseToIndex(int index) {
        index = wrapIndex(index);
        MySinglyLinkedNode currentNode = head;
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

    public MySinglyLinkedNode getHead() {
        return head;
    }

    public MySinglyLinkedNode getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public static void main(String[] args) {
        MySinglyLinkedList linkedList = new MySinglyLinkedList(5);
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
        linkedList.remove(4);
        linkedList.printList();
        linkedList.reverse2();
//        linkedList.reverse();
        linkedList.printList();
    }


}
