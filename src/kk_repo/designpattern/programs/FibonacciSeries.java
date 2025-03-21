package kk_repo.designpattern.programs;

public class FibonacciSeries {
    public static void main(String[] args) {
        iterativeApproach();
    }

    private static void iterativeApproach() {
        // f(10) = 1,1,2,3,5,8
        int first = 0;
        int second = 1;
        int sum = 0;
        System.out.print(first+" "+ second);
        for (int i=2; i<=5; i++) {
            sum = first+second;
            System.out.print(" "+sum);
            first = second;
            second = sum;
        }
    }
}
