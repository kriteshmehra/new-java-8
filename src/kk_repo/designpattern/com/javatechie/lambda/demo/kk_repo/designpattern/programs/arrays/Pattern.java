package kk_repo.designpattern.com.javatechie.lambda.demo.kk_repo.designpattern.programs.arrays;
public class Pattern {
    public static void main(String[] args) {
        System.out.println("================pattern1=======================");
        pattern1();
        System.out.println("================pattern2=======================");
        pattern2();
        System.out.println("================pattern3=======================");

        pattern3();
        System.out.println("================pattern4=======================");

        pattern4();
        System.out.println("================pattern5=======================");

        pattern5();
        System.out.println("================pattern6=======================");

        pattern6();
    }
    /*      10 	9 	8 	7
						6 	5 	4
						3 	2
						1
		*/
    private static void pattern1() {
        int row = 4;
        int num = 10;
        for (int i=0; i<row; i++) {
            for (int j=0; j<row-i; j++) {
                System.out.print(num+" \t");
                num--;
            }
            System.out.println();
        }
    }
    /*
         *
         * *
         * * *
         * * * *
         * * * * *
     */
    private static void pattern2() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
 /*
          *
         **
        ***
       ****
      *****
     ******
 */
    private static void pattern3() {
        int i, j;
        int n = 6;
        for (i = n; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
/*             *
              * *
             * * *
            * * * *
           * * * * *
          * * * * * *
 */
    private static void pattern4() {
        int i, j;
        int n = 6;
        for (i = 0; i < n; i++) {
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
         ***
         **
         *
         **
         ***
     */
    private static void pattern5() {
        int rows = 3;
        // Print upper part of the pattern
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Print lower part of the pattern
        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
     */
    private static void pattern6() {
        int rows = 5;
        // Upper half of the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
