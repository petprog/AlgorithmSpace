/**
 * Created by Taiwo Farinu on 17-Jun-20
 */

package linkedList_solution.doubly;

public class MyDoublyLinkedNode {

    private int value;
    private MyDoublyLinkedNode next;
    private MyDoublyLinkedNode previous;


    public MyDoublyLinkedNode(int value) {
        this.value = value;
        this.previous = null;
        next = null;
    }

    public MyDoublyLinkedNode(int value, MyDoublyLinkedNode previous, MyDoublyLinkedNode next) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyDoublyLinkedNode getNext() {
        return next;
    }

    public void setNext(MyDoublyLinkedNode next) {
        this.next = next;
    }

    public MyDoublyLinkedNode getPrevious() {
        return previous;
    }

    public void setPrevious(MyDoublyLinkedNode previous) {
        this.previous = previous;
    }
}
