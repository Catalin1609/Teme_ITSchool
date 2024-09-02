
// Given a HashMap<String, Integer> containing {"A" -> 10, "B" -> 20, "C" -> 30},
// write a method to get the value associated with the key "B" and print it

import java.util.HashMap;

public class Exercitiul5 {
    public static void main(String[] args) {

        HashMap<String, Integer> alphabetMap = new HashMap<>();
        alphabetMap.put("A", 10);
        alphabetMap.put("B", 20);
        alphabetMap.put("C", 30);

        getValueToMap(alphabetMap, "B");
    }

   public static void getValueToMap(HashMap<String, Integer> alphabetMap, String key) {
        Integer value = alphabetMap.get(key);

       if (value != null) {
           System.out.println("The value corespondent with key " + key + " is " + value);
       } else {
           System.out.println(key + "is missing");
       }
   }
}
