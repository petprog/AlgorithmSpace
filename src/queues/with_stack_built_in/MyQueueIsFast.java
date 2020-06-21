/**
 * Created by Taiwo Farinu on 18-Jun-20
 */

package queues.with_stack_built_in;

import java.util.Stack;

public class MyQueueIsFast {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> auxiliaryStack = new Stack<>();

    public void enqueue(int x) {
        stack.push(x);
    }

    public int dequeue() {
        fillASkWithS();
        int value = auxiliaryStack.pop();
        fillSkWithAS();
        return value;
    }

    public int peek() {
        fillASkWithS();
        int value = auxiliaryStack.peek();
        fillSkWithAS();
        return value;
    }

    private void fillASkWithS() {
        while(!stack.isEmpty()) {
            auxiliaryStack.push(stack.pop());
        }
    }
    private void fillSkWithAS() {
        while(!auxiliaryStack.isEmpty()) {
            stack.push(auxiliaryStack.pop());
        }
    }

}
