/**
 * Created by Taiwo Farinu on 14-Jun-20
 */

package array_copy_example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,76,7,89};

//        int [] arr2 = {5,6,7,8};
        int indexToRemove = 4;
        int newSize = arr1.length-1;
        System.arraycopy(arr1, indexToRemove + 1, arr1, indexToRemove, newSize-indexToRemove);
        int[] newArr = Arrays.copyOf(arr1, newSize);
        System.out.println(Arrays.toString(newArr));

    }
}
