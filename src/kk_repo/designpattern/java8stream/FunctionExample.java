package kk_repo.designpattern.java8stream;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> sentence = str -> "Hello " + str+ " welcome.";
        String str1 = sentence.apply("kritesh");
        System.out.println(str1);
        System.out.println("===============================");

        BiFunction<Integer, Integer, Integer> sum = (a,b) -> a + b ;
        Integer res = sum.apply(3,4);
        System.out.println(res);
    }
}
