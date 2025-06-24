package kk_repo.designpattern.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringPrograms {
		public static void main(String[] args) {
				//Write a Java program to reverse a given string.
				reverseString();
				//program to check if a string is a palindrome.
				palindrome();
				//Count the number of vowels
				countVowels();
				//first non-repeating character in a string
				firstNonRepeatingChar();
				//Count the occurrences of each character
				countOccurenceOfEachChar();
				//Remove all duplicate characters
				removeAllDuplicateCharacters();
				//find the longest substring without any duplicate characters.
				longestSubstring();
		}

		//Write a Java program to reverse a given string.
		public static void reverseString() {
				String str = "abcdefgh";
				StringBuilder res = new StringBuilder();
				for (int i=str.length()-1; i>=0; i--) {
						res.append(str.charAt(i));
				}
				System.out.println("Reversed String = " + res); //hgfedcba
		}

		//program to check if a string is a palindrome.
		private static void palindrome() {
				String str = "radar";
				StringBuilder res = new StringBuilder();
				for (int i=str.length()-1; i>=0; i--) {
						res.append(str.charAt(i));
				}
				if (str.equals(res.toString())) {
						System.out.println("yes its palindrome");
				} else {
						System.out.println("no its not");
				}
		}

		//Count the number of vowels.
		private static void countVowels() {
				String str = "uyetcihto";
				List<Character> ls = Arrays.asList('a', 'e','i','o','u');
				Integer count = 0;
				for (int i=0; i<str.length(); i++) {
						if (ls.contains(str.charAt(i))) {
								count++;
						}
				}
				System.out.println(count);
		}

		//first non-repeating character in a string
		private static void firstNonRepeatingChar() {
				String str = "gghhytqyokt";
				Set<Character> st = new HashSet<>();
				String character1 = str.chars()
						.mapToObj(value -> (char) value)
						.filter(character -> !st.add(character))
						.findFirst().get().toString();
				System.out.println("non-repeating character " + character1);
		}

		//Count the occurrences of each character
		private static void countOccurenceOfEachChar() {
				String str = "radar";
				Map<Character, Long> collect = str.chars()
						.mapToObj(value -> (char) value)
						.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
				System.out.println("occurrences of each character = " + collect);
		}

		//Remove all duplicate characters
		private static void removeAllDuplicateCharacters() {
				String str = "radar";
				Set<Character> seen = new LinkedHashSet<>();
				for (char ch : str.toCharArray())
						seen.add(ch);
				StringBuilder sb = new StringBuilder();
				for (char ch : seen)
						sb.append(ch);
				System.out.println(sb.toString());
		}

		//find the longest substring without any duplicate characters.
		public static void longestSubstring() {
				String str = "ababcabcet";
				StringBuilder sb = new StringBuilder();
				Set<Character> st = new LinkedHashSet<>();
				for (char ch : str.toCharArray()) {
						st.add(ch);
				}
				for (Character ch: st){
						sb.append(ch);
				}
				System.out.println("longest substring without any duplicate characters = "+ sb); //abcet
		}

}
