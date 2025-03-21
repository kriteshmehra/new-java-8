package kk_repo.designpattern.programs.collection;

import java.util.Arrays;

public class ParallelStream {
    public static void main(String[] args) {
        // Create a list of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Sequential stream example
        System.out.println("Sequential Stream:");
        Arrays.stream(numbers)
              .forEach(value -> System.out.println(Thread.currentThread() +" = "+ value));

        // Parallel stream example
        System.out.println("\nParallel Stream:");
        Arrays.stream(numbers)
              .parallel() // Convert the stream to a parallel stream
              .forEach(value -> System.out.println(Thread.currentThread() +" = "+ value));
    }
}
