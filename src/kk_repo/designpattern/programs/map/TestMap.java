package kk_repo.designpattern.programs.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(4, "four");
        map1.put(2, "Two");
        map1.put(5, "five");
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "One");
        map2.put(2, "Two");
        map2.put(3, "Three");

        Map<Integer, String> collect = map2.entrySet().stream().filter(it -> map1.containsKey(it.getKey()))
              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(collect);
    }
}
