package kk_repo.designpattern.programs;

public class LargeNumberAddition {
    public static String add(String num1, String num2) {
        // Make sure num1 is the longer number
        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // Reverse both strings to start adding from the least significant digit
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < num1.length(); i++) {
            int digit1 = num1.charAt(i) - '0'; // Convert character to digit
            int digit2 = (i < num2.length()) ? num2.charAt(i) - '0' : 0; // Pad with zeros if needed
            int total = digit1 + digit2 + carry;
            sum.append(total % 10); // Append the least significant digit of the total
            carry = total / 10; // Update the carry for the next iteration
        }
        // If there's a carry after the last addition, append it to the sum
        if (carry > 0) {
            sum.append(carry);
        }
        // Reverse the sum to get the correct result
        return sum.reverse().toString();
    }
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "987";
        String result = add(num1, num2);
        System.out.println("Sum: " + result);
    }
}
