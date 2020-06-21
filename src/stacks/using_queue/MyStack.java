/**
 * Created by Taiwo Farinu on 19-Jun-20
 */

package stacks.using_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyStack {

    private Queue<Integer> queue;
    private List<Integer> auxArray;

    public MyStack() {
        queue = new PriorityQueue<>();
        auxArray = new ArrayList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        fillauxArrayWithQ();
        int value = auxArray.remove(auxArray.size()-1);
        fillQWithAuxArray();
        return value;
    }

    /**
     * Get the top element.
     */
    public int top() {
        fillauxArrayWithQ();
        int value = queue.peek();
        fillQWithAuxArray();
        return value;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }

    private void fillauxArrayWithQ() {
        while (!queue.isEmpty()) {
            auxArray.add(queue.poll());
        }
    }

    private void fillQWithAuxArray() {
        while (!auxArray.isEmpty()) {
            queue.add(auxArray.remove(auxArray.size() -1));
        }
    }


}
