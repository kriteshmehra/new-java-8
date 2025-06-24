package kk_repo.designpattern.java8stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 19,4, 5, 6, 7, 8, 9, 20, 13);
        // Prime number
        System.out.println(numbers.stream()
                .filter(PrimeNumber::isPrime)
                .collect(toList()));
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);

    }
}
