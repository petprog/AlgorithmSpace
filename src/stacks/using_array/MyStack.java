/**
 * Created by Taiwo Farinu on 18-Jun-20
 */

package stacks.using_array;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack {

    private List<Integer> array = new ArrayList<>();

    public MyStack() {

    }

    public void push(int value) {
        array.add(value);
    }

    public int pop() {
        if (array.size() == 0) {
            throw new EmptyStackException();
        }
        return array.remove(array.size() - 1);
    }

    public int peek() {
        if (array.size() == 0) {
            throw new EmptyStackException();
        }
        return array.get(array.size() - 1);
    }

    public void printStack() {
        if(array.isEmpty()) {
            System.out.println("Empty ");
            System.out.println("-----------------------");
            return;
        }
        System.out.print("Bottom ");
        System.out.print(array.get(0));
        for(int i = 1; i < array.size(); i++) {
            System.out.print(" <--- " + array.get(i));
        }
        System.out.print(" Top");
        System.out.println();
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printStack();
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
        stack.push(3);
        stack.printStack();
        stack.push(4);
        stack.printStack();
    }

}
