
// Create a HashMap<Integer, String> and add the following key-value pairs: 1 -> "One"
// 2 -> "Two", 3 -> "Three". Then, print the map.

import java.util.HashMap;
import java.util.HashSet;

public class Exercitiul4 {
    public static void main(String[] args) {

        HashMap<Integer, String> numberMap = new HashMap<>();

        numberMap.put(1, "One");
        numberMap.put(2, "two");
        numberMap.put(3, "Three");

        System.out.println(numberMap);




    }
}
