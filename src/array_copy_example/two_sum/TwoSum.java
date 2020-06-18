/**
 * Created by Taiwo Farinu on 15-Jun-20
 */

package array_copy_example.two_sum;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
//        int[] arr = {2, 7, 11, 15};
//        int[] arr = {3, 2, 4};
        int[] arr = {1, 2, 3, 4, 2};
//        int[] arr = {-2};
        System.out.println(containsDuplicate2(arr));
//        moveZeroes(arr);
//        rotateArray(arr, 2);
//        System.out.println(Arrays.toString(twoSum(arr, 6)));
        System.out.println(longestWord("I love dogs"));
    }

    static int[] twoSum(int[] nums, int target) {

        // result is the Indices of the to numbers
        Map<Integer, Integer> compl = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int[] resultArray = new int[2];
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int itemArray = nums[low];
            if (result.size() == 2) {
                break;
            }
            if (compl.containsKey(itemArray)) {
                result.add(compl.get(itemArray));
                result.add(low);
            }
            compl.put(target - itemArray, low);
            low++;
        }

        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);

        }
        return resultArray;

    }

    static boolean containsDuplicate(int[] nums) {

        Set<Integer> uniques = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            uniques.add(nums[i]);
        }
        return nums.length - uniques.size() != 0;
    }

    static boolean containsDuplicate2(int[] nums) {

        Set<Integer> uniques = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            } else {
                uniques.add(nums[i]);
            }
        }
        return false;
    }

    static void moveZeroes(int[] nums) {
        int j = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (value == 0) {
                k++;
                continue;
            }
            nums[j] = nums[i];
            j++;
        }
        for (int i = 0; i < k; i++) {
            nums[nums.length - 1 - i] = 0;
        }
        System.out.println("k: " + k);
        System.out.println(Arrays.toString(nums));

    }

    public static void rotateArray(int[] nums, int k) {

        int[] savedArray = Arrays.copyOf(nums, nums.length);
        k /= nums.length;
        System.arraycopy(savedArray, 0, nums, k, nums.length - k);
        System.arraycopy(savedArray, nums.length - k, nums, 0, k);


        System.out.println(Arrays.toString(nums));

    }

    public static String longestWord(String sen) {
        String[] strings = sen.split(" ");
        String word = "";
        int count = 0;
        for (String s : strings) {
            String filteredString = remainLetters(s);
            if (filteredString.length() > count) {
                count = filteredString.length();
                word = filteredString;
            }
        }
        return word;
    }

    static String remainLetters(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
