/**
 * Created by Taiwo Farinu on 14-Jun-20
 */

package array_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Object[] strings =
        ArrayList<Object> strings = new ArrayList<>(Arrays.asList('a','b','c','d'));

        strings.add('e'); // 0(1)
        strings.remove(strings.size()-1); // 0(1)
//        strings.add(0,'x');
        strings.add(2,2);
        System.out.println(strings);
    }
}
