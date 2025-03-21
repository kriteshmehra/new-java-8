package kk_repo.designpattern.programs.arrays;

public class NegativePositiveNumber {
    public static void main(String[] args) {
        int[] arr = { 1, -3, 2, 3, 6, -1 };
        for (int i = 0; i< arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] > 0 && arr[j] < 0 && Math.abs(arr[i]) == Math.abs(arr[j]) ||
                      (arr[i] < 0 && arr[j] > 0 && Math.abs(arr[i]) == Math.abs(arr[j]))) {
                    if (arr[i] < 0) {
                        System.out.print(arr[i] + " " + arr[j]);
                    } else
                        System.out.print(arr[j] + " " + arr[i]);
                }
            }
        }
    }
}
