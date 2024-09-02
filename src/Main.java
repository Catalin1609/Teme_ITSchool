
// 1. Create an ArrayList<String> and add the following elements to it: "apple", "banana", "orange".
// Then, print out all the elements in the list.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> food = new ArrayList<>();
        food.add("apple");
        food.add("banana");
        food.add("orange");

        System.out.println(food);

    }
}