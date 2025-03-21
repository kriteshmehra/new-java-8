package kk_repo.designpattern.programs;

import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 20; // Define the upper limit
        System.out.println("Prime numbers up to " + limit + ":");
        IntStream.rangeClosed(2, limit) // Generate a stream of integers from 2 to the limit
              .filter(PrimeNumbers::isPrime) // Filter out non-prime numbers
              .forEach(System.out::println); // Print each prime number
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
    }
}
