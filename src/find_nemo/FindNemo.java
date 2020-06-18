/**
 * Created by Taiwo Farinu on 12-Jun-20
 */

package find_nemo;

import java.util.Arrays;

public class FindNemo {

    public static void main(String[] args) {
        String[] arr = new String[]{"nemo"};
        String[] everyone = new String[]{"dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla", "hank", "seat"};
//        findNemo(arr);
//        String[] large = new String[100000];
        int[] largeNumbers = new int[3000];
//        Arrays.fill(large, "nemo");
        Arrays.fill(largeNumbers, 1);
//        findNemo(large); // 0(n)
//        compressFirstBox(large); // 0(1)
//        int[] items = {1,2,3,4,5,6};
        int[] items = {1, 2, 3};
//        logAllPairsE(largeNumbers);
//        printFirstItemThenFirstHalfThenSayHi100Times(everyone);
        logAllTriple(items);

    }

    public static void findNemo(String[] list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals("nemo")) {
                System.out.println("Found Nemo");
                break;
            }
        }

        long finishTime = System.currentTimeMillis();
        System.out.println("That took: " + (finishTime - startTime) + " ms");
    }

    static void compressFirstBox(String[] list) {
        long startTime = System.currentTimeMillis();
        System.out.println(list[0]);
        long finishTime = System.currentTimeMillis();
        System.out.println("That took: " + (finishTime - startTime) + " ms");
    }

    static void printFirstItemThenFirstHalfThenSayHi100Times(String[] items) {
        System.out.println((items[0]));

        int index = 0;
//        int middleIndex = (int) Math.floor((double) items.length / 2);
        int middleIndex = items.length / 2;

        while (index < middleIndex) {
            System.out.println(items[index]);
            index++;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }

    }

    static void logAllPairsE(int[] arr) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++)
                System.out.println("a: " + arr[i] + " b: " + arr[j]);
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("That took: " + (finishTime - startTime) + " ms");
    }
//    static void logAllPairs(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//                System.out.println("a: "+arr[i] + " b: "+arr[arr.length-1-i]);
//        }
//    }

    static void logAllPairs(int[] arr) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.println("a: " + arr[i] + " b: " + arr[j]);
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("That took: " + (finishTime - startTime) + " ms");
    }
    static void logAllTriple(int[] arr) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++)
                for (int k = j; k < arr.length; k++)
                System.out.println("a: " + arr[i] + " b: " + arr[j]+ " b: " + arr[k]);
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("That took: " + (finishTime - startTime) + " ms");
    }
}
