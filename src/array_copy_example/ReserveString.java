/**
 * Created by Taiwo Farinu on 14-Jun-20
 */

package array_copy_example;

import java.util.Arrays;

public class ReserveString {

    public static void main(String[] args) {

        String word = "The fear of God is the beginning of wisdom";
        System.out.println(reverseString(word));
    }

    static String reverseString(String words) {
        StringBuilder reversedWords = new StringBuilder();
        int i  = words.length()-1;
        while (i >= 0) {
            reversedWords.append(words.charAt(i));
            i--;
        }
        return reversedWords.toString();

    }
}
