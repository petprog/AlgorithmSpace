/**
 * Created by Taiwo Farinu on 14-Jun-20
 */

package array_copy_example;

import java.util.Arrays;

public class MergeSortExample {

    public static void main(String[] args) {
        // Two sorted arrays
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {3, 4, 6};

        System.out.println(Arrays.toString(mergeSort(arr1, arr2)));
    }

    static int[] mergeSort(int[] arr1, int[] arr2) {

        int m = arr1.length;
        int n = arr2.length;

        int i = 0, j = 0, k = 0;

        final int[] mergedArray = new int[m + n];

        while (i < m && j < n) {
            if(arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < m) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < n) {
            mergedArray[k++] = arr2[j++];
        }

            return mergedArray;
    }
}
