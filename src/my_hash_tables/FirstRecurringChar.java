/**
 * Created by Taiwo Farinu on 16-Jun-20
 */

package my_hash_tables;

import java.util.*;

public class FirstRecurringChar {

    static void firstRecurringChar(int[] arr) {
        int result = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int item : arr) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
                if (map.get(item) == 2) {
                    result = item;
                    break;
                }
            } else {
                map.put(item, 1);
            }
        }
        System.out.println(map);
        System.out.println(result);
    }

    static void firstRecurringCharBetter(int[] arr) {
        int result = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int item : arr) {
            if (map.containsKey(item)) {
                result = item;
                break;
            } else {
                map.put(item, 0);
            }
        }
        System.out.println(map);
        System.out.println(result);
    }

    static void firstRecurringCharBest(int[] arr) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int item : arr) {
            if (set.contains(item)) {
                result = item;
                break;
            } else {
                set.add(item);
            }
        }
        System.out.println(result);
    }

    static int firstRecurringCharWorst(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return 0;
    }

    static void firstRecurringCharWorst2(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (result != 0) {
                break;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    result = arr[i];
                    break;
                }
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
//        int[] arr = {2,1,1,2,5,6};
        int[] arr = {2,5, 1, 3, 8, 3, 1, 5, 6};
//        firstRecurringChar(arr);
//        firstRecurringCharBetter(arr);
//        firstRecurringCharBest(arr);
        firstRecurringCharWorst2(arr);
    }
}
