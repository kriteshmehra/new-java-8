package kk_repo.designpattern.programs.arrays;

public class NumbersStartingWithOne {
    public static void main(String[] args) {
        int[] arr= {12, 11, 111, 22, 1222, 565, 0112};
        System.out.println("Numbers starting with 1:");
        for (int num : arr) {
            String numStr = Integer.toString(num);
            if (numStr.charAt(0) == '1') {
                System.out.println(num);
            }
        }
    }
}
