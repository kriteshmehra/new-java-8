package kk_repo.designpattern.programs.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        withJavaStream();
        withoutJavaStream();
    }

    private static void withoutJavaStream() {
        String str = "This This is is is my home home home";
        String[] split = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i< split.length; i++) {
            if (map.containsKey(split[i])) {
                Integer count = map.get(split[i]);
                map.put(split[i], count+1);
            } else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
    }

    private static void withJavaStream() {
        String str = "This This is is is my home home home";
        Map<String, Long> collect = Arrays.stream(str.split(" "))
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("with streams " + collect);
    }
}
