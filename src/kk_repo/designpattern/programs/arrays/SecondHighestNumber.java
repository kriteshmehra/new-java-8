package kk_repo.designpattern.programs.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumber {
    public static void main(String[] args) {
        withStream();
        withOutStream();
    }
    private static void withOutStream() {
        int[] nums = {10, 12, 15, 20, 30, 45, 1, 5, 6};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        System.out.println("Second highest number (without stream): " + secondMax);
    }
    private static void withStream() {
        int[] nums = {10, 12, 15, 20, 30, 45, 1, 5, 6};
        int secondMax = Arrays.stream(nums)
              .boxed()
              .sorted(Comparator.reverseOrder())
              .distinct()
              .skip(1)
              .findFirst()
              .get();

        System.out.println("Second highest number (with stream): " + secondMax);
    }
}
