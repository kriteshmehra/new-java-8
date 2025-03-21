package kk_repo.designpattern.programs.string;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindrom {
    public static boolean canMakePalindrome(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Count the number of characters with odd frequencies
        int oddCount = 0;
        for (int frequency : charFrequency.values()) {
            if (frequency % 2 != 0) {
                oddCount++;
            }
        }

        // For a string to be rearranged into a palindrome, it can have at most one character with an odd frequency
        return oddCount <= 1;
    }

    public static void main(String[] args) {
        String str = "racecar";
        if (canMakePalindrome(str)) {
            System.out.println("Yes, you can make a palindrome from the string \"" + str + "\"");
        } else {
            System.out.println("No, you cannot make a palindrome from the string \"" + str + "\"");
        }
    }
}
