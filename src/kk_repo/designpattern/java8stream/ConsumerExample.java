package kk_repo.designpattern.java8stream;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> res1 = str -> System.out.println(str);
        res1.accept("Hello world");

        BiConsumer<String, String> concatConsumer =
                (s1, s2) -> System.out.println(s1 + " " + s2);
        concatConsumer.accept("Hi", "Kritesh");
    }
}
