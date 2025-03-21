package kk_repo.designpattern.programs.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElements {
    public static void main(String[] args) {
        Integer[] numbe = { 5,7,8,5,9,8,6,8,2,3,4,2 };
        Stream<Integer> distinct = Stream.of(numbe).distinct();

        usingJava8();

        ArrayList<Integer> al = new ArrayList<>();
        int[] numbers = {5,7,8,5,9,8,6,8,2,3,4,2};
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    if (al.contains(numbers[i])) {
                        break;
                    } else {
                        al.add(numbers[i]); //[5, 8, 2]
                    }
                }
            }
        }
        System.out.println("duplicate integers:  "+ al);

    }

    private static void usingJava8() {
        Integer[] numbers = { 5,7,8,5,9,8,6,8,2,3,4,2 };
        Set<Integer> allItems = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(numbers)
              .filter(n -> !allItems.add(n)) //Set.add() returns false if the item was already in the set.
              .collect(Collectors.toSet());
        System.out.println(duplicates); // [2, 5, 8]
    }
}
