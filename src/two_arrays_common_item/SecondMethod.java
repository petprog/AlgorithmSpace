/**
 * Created by Taiwo Farinu on 14-Jun-20
 */

package two_arrays_common_item;

public class SecondMethod {

    public static void main(String[] args) {

        char[] a1 = {'a', 'b', 'c', 'x'};
        char[] a2 = {'z', 'y', 'i',};

        System.out.println(hasCommonItemInTwoArray(a1, a2));
    }

    static boolean hasCommonItemInTwoArray(char[] array1, char[] array2) {

        // 0(n^2)
        for (char value : array1) {
            for (char c : array2) {
                if (value == c) {
                    return true;
                }
            }
        }
        return false;
    }
}
