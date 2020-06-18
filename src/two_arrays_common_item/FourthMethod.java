/**
 * Created by Taiwo Farinu on 14-Jun-20
 */

package two_arrays_common_item;

import java.util.HashMap;

public class FourthMethod {

    public static void main(String[] args) {

        char[] a1 = {'a', 'b', 'c', 'x'};
        char[] a2 = {'z', 'y', 'i', 'c'};

        System.out.println(hasCommonItemInTwoArray(a1, a2));
    }

    static boolean hasCommonItemInTwoArray(char[] array1, char[] array2) {

        HashMap<Character, Boolean> map = new HashMap<>();
        for (char i1 : array1) {
            map.put(i1, true);
        }

        for (char i2 : array2) {
            if (map.getOrDefault(i2, false)) {
                return true;
            }
        }
        return false;
    }
}
