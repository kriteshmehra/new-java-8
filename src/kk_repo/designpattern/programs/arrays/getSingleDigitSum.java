package kk_repo.designpattern.programs.arrays;

public class getSingleDigitSum {
    public static void main(String[] args) {
        int number = 59768;
        int result = getSingleDigitSum(number);
        System.out.println("Single digit sum: " + result);
    }
    public static int getSingleDigitSum(int num) {
        if (num < 10) {
            return num;
        }
        int sum = num % 10 + getSingleDigitSum(num / 10);
        if (sum > 9) {
            return getSingleDigitSum(sum);
        }
        return sum;
    }
}
