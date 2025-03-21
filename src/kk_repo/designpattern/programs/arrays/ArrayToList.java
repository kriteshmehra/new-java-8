package kk_repo.designpattern.programs.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Set;

public class ArrayToList {
    public static void main(String[] args) {
        intArrayToList();

    }

    private static void intArrayToList() {
        //sum of the even numbers in the array, using java 8
        int[] in = {1,2,3,4,5,6,7,8};
        int sum = Arrays.stream(in).filter(value -> value % 2 == 0)
              .sum();
        System.out.println(sum);
    }


}
