
// 2. Given a List<String> containing ["cat", "dog", "bird"], write a method to check if the
// list contains the element "dog" and print a message indicating whether it is present or not

import java.util.ArrayList;
import java.util.List;

public class Exercitiu2 {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");

        checkDog(animals);
    }

    public static void checkDog(List<String>animals) {
        if (animals.contains("dog")) {
            System.out.println("Dog is here");
        } else {
            System.out.println("dog is not here");
        }
    }

}
