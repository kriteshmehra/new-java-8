package kk_repo.designpattern.practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayTest2 {
		Object[] nestedArray = {1, new Object[]{2, 3, new Object[]{4, 5}}, 6, new Object[]{7, 8}};
		//flattenArray()
		public static <T> Stream<T> flatten(Object[] array) {
			return Arrays.stream(array)
					.flatMap(o -> o instanceof Object[] ? flatten((Object[]) o) : Stream.of((T) o));
		}

	public static void main(String[] args) {
		Object[] nestedArray = {1, new Object[]{2, 3, new Object[]{4, 5}}, 6, new Object[]{7, 8}};
		Object[] flattenedArray = flatten(nestedArray).toArray();
		System.out.println(Arrays.toString(flattenedArray));
	}

}
