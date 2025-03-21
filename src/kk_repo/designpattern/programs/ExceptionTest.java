package kk_repo.designpattern.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExceptionTest {
    public static void main(String[] args) {
       // System.out.println(testMethod());
        //System.out.println("after");
        //testMethod();

/*        List<Integer> ls = List.of(8,5,4,7,5,1,2,3,7,8,7);
        Set<Integer> collect = ls.stream().collect(Collectors.toSet());
        System.out.print(collect);
        ls.stream().distinct().forEach(System.out::print);*/

        System.out.println("Query 17 : Find the count of each char in a string ?");
        String str = "ABCDABCDACTETY";
        Map<Character, Long> collect = str.chars()
              .mapToObj(value -> (char) value)
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        String str1 = "This This is is is one";

        // Using Java 8 streams to count occurrences of each word
        Map<String, Long> wordCount = Arrays.stream(str1.split("\\s+"))
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordCount);

    }

    private static String testMethod() {
        try {
            int i = 10/2;
           // System.out.println("test");
            return "test";
        } catch (ArithmeticException e) {
            //System.out.println("catch");
            return "catch";
        } finally {
            //System.out.println("finally");
            return "finally";
        }
        //return "method";
    }
}
