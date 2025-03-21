package kk_repo.designpattern.programs.arrays;

public class LeastDifferenceNumbers {
    public static void main(String[] args) {
        int[] numbers = { 10, 2, 7, 16, 12 };
        int[] result = new int[2];
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int difference = Math.abs(numbers[i] - numbers[j]);
                if (difference < minDifference) {
                    minDifference = difference;
                    result[0] = numbers[i];
                    result[1] = numbers[j];
                }
            }
        }
        System.out.println("Numbers with least difference: " + result[0]
            + " and "
            + result[1]+ " and difference " + minDifference);
    }
}
