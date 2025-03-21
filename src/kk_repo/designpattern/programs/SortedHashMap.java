package kk_repo.designpattern.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SortedHashMap {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(3, "Three");
        map1.put(2, "Two");
        map1.put(1, "one");
        map1.put(6, "six");
        map1.put(5, "five");
        map1.put(4, "four");

        map1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        String value = "abc"; // Replace this with the actual value or keep it as null

        Optional<String> abc = Optional.ofNullable(value);

        // Now you can safely work with the Optional without risking a NullPointerException
        if (abc.isPresent()) {
            String result = abc.get();
            System.out.println(result);
        } else {
            System.out.println("Optional is empty");
        }
    }
}
