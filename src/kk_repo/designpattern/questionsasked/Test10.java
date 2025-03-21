package kk_repo.designpattern.questionsasked;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Test10 {
		public static void main(String[] args) {
/*
				ApPle
				aPpLE
*/
				String str = "ApPle";
				StringBuilder builder = new StringBuilder();
				String collect3 = str.chars().mapToObj(value -> (char) value)
						.map(ch -> Character.isUpperCase(ch) ? ch.toString().toLowerCase() : ch.toString().toUpperCase())
						.collect(Collectors.joining());
				System.out.println(collect3); //aPpLE
//==================================================================================================================
				List<Integer> ls = Arrays.asList(3,2,7,0,4,0,6,1,0,9,0);
				List<Integer> collect1 = ls.stream().filter(integer -> integer == 0).collect(Collectors.toList());
				List<Integer> collect2 = ls.stream().sorted(Comparator.comparingInt(value -> (int) value).reversed()).filter(integer -> integer != 0).collect(Collectors.toList());
				List<Integer> concat = Stream.concat(collect1.stream(), collect2.stream()).collect(Collectors.toList());
				System.out.println(concat); //[0, 0, 0, 0, 9, 7, 6, 4, 3, 2, 1]
//==================================================================================================================

				Map<Integer, Integer> map = new HashMap<>();
				map.put(2, 3);
				map.put(5, 1);
				map.put(3, 2);
				LinkedHashMap<Object, Object> collect = map.entrySet().stream()
						.sorted(Comparator.comparingInt(Map.Entry::getValue))
						.collect(LinkedHashMap::new,
								(map1, entry) -> map1.put(entry.getKey(), entry.getValue()),
								LinkedHashMap::putAll);
				System.out.println(collect); //{5=1, 3=2, 2=3}
/*				List<Integer> collect = ls.stream()
						.sorted(Comparator.comparingInt(value -> (int) value))
						.filter(integer -> integer > 0)
						.collect(Collectors.toList());
				System.out.println(collect);*/

		}
}

