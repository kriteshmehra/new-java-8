package kk_repo.designpattern.programs.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        anagram(s1, s2);
    }

    private static void anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("Word not an anagram");
        } else {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1, ch2)) {
                System.out.println("Word is an anagram");
            } else {
                System.out.println("Word not an anagram");
            }
        }
    }
}
