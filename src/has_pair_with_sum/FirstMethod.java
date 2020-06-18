/**
 * Created by Taiwo Farinu on 13-Jun-20
 */

package has_pair_with_sum;

import java.util.Arrays;

public class FirstMethod {

    public static void main(String[] args) {
//        int[] a = {1,2,4,5,8};
        // If the array is sorted
        int[] a = {1,2,4,4};
        Arrays.sort(a);
        System.out.println(hasPairWithSum(a, 8));
    }

    static boolean hasPairWithSum(int[] arr, int sum) {

        int low = 0;
        int high = arr.length-1;
        while (low < high) {
            int s = arr[low]+arr[low+1];
            if(s == sum) {
                return true;
            }
            low++;
        }
        return false;
    }
}
