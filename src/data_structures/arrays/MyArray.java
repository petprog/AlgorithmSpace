/**
 * Created by Taiwo Farinu on 14-Jun-20
 */

package data_structures.arrays;

import java.util.Arrays;

public class MyArray {

    private int length;
    private Object[] data;

    public MyArray() {
        this.length = 0;
        this.data = new Object[1];
    }

    public Object get(int index) {
        return this.data[index];
    }

    public int push(Object item) {
        data = Arrays.copyOf(data, length+1);
        data[this.length] = item;
        this.length++;
        return this.length;
    }

    public Object pop() {
        Object lastItem = this.data[length-1];
        data[length-1] = null;
        length--;
        return lastItem;
    }

    public Object delete(int index) {
        Object item = this.data[index];
        shiftItem(index);
        return item;
    }

    private void shiftItem(int index) {
        if (length - 1 - index >= 0) {
            System.arraycopy(data, index+1, data, index, length-index-1);
        }
        data[length - 1] = null;
        length--;
    }

    @Override
    public String toString() {
        return "length: " + length + ", data: " + Arrays.toString(data);
    }

    public static void main(String[] args) {
        MyArray newArray = new MyArray();
        newArray.push("Hi");
        newArray.push("You");
        newArray.push("And");
        newArray.push("Me");

        newArray.pop();
//        newArray.pop();
        newArray.delete(1);

        System.out.println(newArray);

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray.get(i));
        }

    }


}
