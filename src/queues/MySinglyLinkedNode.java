/**
 * Created by Taiwo Farinu on 18-Jun-20
 */

package queues;

public class MySinglyLinkedNode {

    private int value;
    private MySinglyLinkedNode next;

    public MySinglyLinkedNode(int value) {
        this.value = value;
        next = null;
    }

    public MySinglyLinkedNode(int value, MySinglyLinkedNode next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MySinglyLinkedNode getNext() {
        return next;
    }

    public void setNext(MySinglyLinkedNode next) {
        this.next = next;
    }
}
