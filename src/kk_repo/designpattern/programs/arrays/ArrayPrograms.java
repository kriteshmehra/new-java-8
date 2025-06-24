package kk_repo.designpattern.programs.arrays;

import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Set;

public class ArrayPrograms {
    public static void main(String[] args) {
        firstRepeatingChar();
        findLargestAndSmalledNumber();
    }

    private static void findLargestAndSmalledNumber() {
        int[] arr = {10,14,15,2004,2,1};
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            } else if (min > j) {
                min = j;
            }
        }
        System.out.println("max= " + max + " min= "+min);
    }

    private static void firstRepeatingChar() {
        String input = "afeel the need";
        Set<Integer> seen = new HashSet<>();
        OptionalInt first = input.chars()
              .filter(i -> !seen.add(i))
              .findFirst();
        if (first.isPresent()) {
            System.out.println((char) first.getAsInt());
        }
}
}
