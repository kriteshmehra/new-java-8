package kk_repo.designpattern.programs.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringPrograms {
    public static void main(String[] args) {
        sortStringInAlpOrder();
        reverseEachWord();
        findFirstNonRepeatedChar1();
        removeDuplicateChars1();
        map1();
        String str1 = "hello";
        String str2 = "hello";
        if (str1==str2) {
            System.out.println("==");
        }
        if (str1.equals(str2)) {
            System.out.println("equal");
        }

    }

    private static void sortStringInAlpOrder() {
        String str = "rock";
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }

    private static void reverseEachWord() {
        String str = "Java code";
        String output="";
        String[] words = str.split(" ");
        for(String word: words) {
            String revWord="";
            for (int i=word.length()-1; i>=0; i--) {
                revWord = revWord + word.charAt(i);
            }
            output = output + revWord + " ";
        }
        System.out.println(output);
        //using java -8
        String result = Arrays.stream(str.split(" "))
            .map(word -> new StringBuilder(word).reverse().toString())
            .collect(Collectors.joining(" "));

        System.out.println("Reversed words using java-8: " + result);

    }

    private static void findFirstNonRepeatedChar1() {
        String str = "AABCDCERTBA";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i=0; i<str.length(); i++){
            if (hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }
        System.out.println(hm);
        for (Map.Entry entry : hm.entrySet()) {
            if (entry.getValue() == (Integer)1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }

    private static void removeDuplicateChars1() {
        String str = "Welcome to Java";
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(value -> sb.append((char) value));
        System.out.println(sb);
    }

    private static void map1() {
        String s1 = "kriteshkumar";
        Map<Character, Long> collect = s1.chars()
              .mapToObj(value -> (char)value)
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
