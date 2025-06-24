/*
package kk_repo.designpattern.questionsasked;

import java.util.HashMap;
import java.util.Map;

public class ReplaceWithDollar {
		public static void main(String[] args) {
				String str1 = "tomorrow";
				System.out.println(transformString(str1)); //o/p: t$m$$rr$$$w
		}

		public static String transformString(String str) {
				StringBuilder result = new StringBuilder();
				Map<Character, Integer> charCountMap = new HashMap<>();

				for (char ch : str.toCharArray()) {
						// Get the occurrence count and increment it
						int count = charCountMap.getOrDefault(ch, 0) + 1;
						charCountMap.put(ch, count);

						// Replace the character with 'count' number of '$' symbols
						if (ch == 'o') {
								result.append("$".repeat(count));
						} else {
								result.append(ch);
						}
				}
				return result.toString();
		}
}
*/
