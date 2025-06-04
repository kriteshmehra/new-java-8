package kk_repo.designpattern.java8stream;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> randomNum = () -> new Random().nextInt(100);
        Integer num1 = randomNum.get();
        System.out.println(num1);
        System.out.println("================================");

        Supplier<String> defaultStr = () -> "default string";
        String str1 = defaultStr.get();
        System.out.println(str1);
    }
}
