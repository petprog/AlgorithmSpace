/**
 * Created by Taiwo Farinu on 14-Jun-20
 */

package two_arrays_common_item;

import java.util.HashSet;
import java.util.Set;

public class ThirdMethod {

    public static void main(String[] args) {

        char[] a1 = {'a', 'b', 'c', 'x'};
        char[] a2 = {'z', 'y', 'i','x'};

        System.out.println(hasCommonItemInTwoArray(a1, a2));

    }

    static boolean hasCommonItemInTwoArray(char[] array1, char[] array2) {
        Set<Character> objects = new HashSet<>();

        for(char i1: array1) {
            objects.add(i1);
        }

        for(char i2: array2) {
            if(objects.contains(i2)) {
                return true;
            }
        }
        return false;

    }
}
