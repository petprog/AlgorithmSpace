/**
 * Created by Taiwo Farinu on 13-Jun-20
 */

package has_pair_with_sum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SecondMethod {

    public static void main(String[] args) {

        // If not sorted and the speed is fast
//        int[] a = {1,3,2,2, 3, 2, 4,3, 3,8};
        int[] a = {1,3,2,2,4, 3, 2, 3,3, 3,8};
        System.out.println(hasPairWithSum(a, 8));
    }

    static boolean hasPairWithSum(int[] arr, int sum) {
        Set<Integer> compl = new HashSet<>();
        int low  = 0;
        int high = arr.length;

        while(low < high) {
            int value = arr[low];
            if(compl.contains(value)) {
                return true;
            }
            compl.add(sum - value);
            low++;
        }
        return false;
    }
}