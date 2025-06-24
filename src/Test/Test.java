package Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		String in = "ababcabcet";
		StringBuilder strBuilder = new StringBuilder();
		//List<StringBuilder> ls = new ArrayList<>();
		Map<StringBuilder, Integer> map = new HashMap<>();
		for (int i=0; i<=in.length()-1; i++) {
			if (strBuilder.toString().contains(String.valueOf(in.charAt(i)))) {
				map.put(strBuilder, strBuilder.length());
				//ls.add(strBuilder);
				strBuilder = new StringBuilder();
				strBuilder.append(in.charAt(i));
			} else {
				strBuilder.append(in.charAt(i));
			}
		}
		StringBuilder key = map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		System.out.println(key);

		System.out.println(map);
	}


}
