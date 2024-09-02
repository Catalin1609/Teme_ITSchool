

// 3. Convert the array String[] fruits = {"apple", "banana", "cherry"} to an ArrayList

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercitiul3 {
    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "cherry"};

        List<String> fruitsList = new ArrayList<>(Arrays.asList(fruits));

        List<String> fruits1 = List.of(fruits);

        List<String> list = Arrays.stream(fruits).toList();

        System.out.println(fruitsList);
    }
}
