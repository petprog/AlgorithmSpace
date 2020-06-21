/**
 * Created by Taiwo Farinu on 18-Jun-20
 */

package queues.with_stack_using_arrays;

import java.util.ArrayList;
import java.util.List;

public class FunnyQueues {

    private List<Integer> first;
    private List<Integer> last;

    public FunnyQueues() {
        first = new ArrayList<>();
        last = new ArrayList<>();
    }

    public void enqueue(int value) {
        int length = this.first.size();
        for (int i = 0; i < length; i++) {
            last.add(first.remove(length - 1));
        }
        last.add(value);
    }

    public int dequeue() {
        int length = this.last.size();
        for (int i = 0; i < length; i++) {
            first.add(last.remove(last.size() - 1));
        }
        return first.remove(first.size() - 1);
    }

    public int peek() {
        if (last.size() > 0) {
            return last.get(0);
        }
        if(first.size() > 0)
            return first.get(first.size() - 1);
        return 0;
    }

    public void printStack() {
        if(first.isEmpty()) {
            System.out.println("Empty ");
            System.out.println("-----------------------");
            return;
        }
        System.out.print("Bottom ");
        System.out.print(first.get(0));
        for(int i = 1; i < first.size(); i++) {
            System.out.print(" <--- " + first.get(i));
        }
        System.out.print(" Top");
        System.out.println();
        System.out.println("first" + first);
        System.out.println("last" + last);
        System.out.println("-----------------------");
    }

    public void empty() {

        System.out.println(first.isEmpty());
    }

    public static void main(String[] args) {
        FunnyQueues myQueue = new FunnyQueues();
        myQueue.enqueue(1);
        myQueue.enqueue(1);
        myQueue.dequeue();
        myQueue.printStack();
        myQueue.empty();
    }


}
