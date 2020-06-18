/**
 * Created by Taiwo Farinu on 13-Jun-20
 */

package two_arrays_common_item;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstMethod {

    public static void main(String[] args) {
        Object[] a1 = {'a', 'b', 'c', 'x', 5, null};
        Object[] a2 = {'z', 'y', null, 'i', 6, 8, 2};

        System.out.println(hasCommonItemInTwoArray(a1, a2));
    }

    static boolean hasCommonItemInTwoArray(Object[] array1, Object[] array2) {

        Set<Object> s1 = new HashSet<>(Arrays.asList(array1));
        Set<Object> s2 = new HashSet<>(Arrays.asList(array2));
        s1.retainAll(s2);
        return s1.size() > 0;
    }


}

