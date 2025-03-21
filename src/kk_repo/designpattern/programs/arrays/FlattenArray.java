package kk_repo.designpattern.programs.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenArray {
		public static void main(String[] args) {
				Object[] nestedArray = {1, new Object[]{2, 3,
						new Object[]{4, 5}}, 6, new Object[]{7, 8}};

				// Flatten the nested array
				Object[] flattenedArray = flatten(nestedArray);

				// Print result
				System.out.println("Flattened Array: "
						+ Arrays.toString(flattenedArray));
		}

		public static Object[] flatten(Object[] nestedArray) {
				List<Object> result = new ArrayList<>();
				flattenHelper(nestedArray, result);
				return result.toArray();
		}

		private static void flattenHelper(Object[] nestedArray, List<Object> result) {
				for (Object element : nestedArray) {
						if (element instanceof Object[]) {
								// Recursively flatten nested arrays
								flattenHelper((Object[]) element, result);
						} else {
								// Add non-array elements to result
								result.add(element);
						}
				}
		}
}
