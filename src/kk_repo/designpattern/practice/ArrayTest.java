package kk_repo.designpattern.practice;

import java.util.Arrays;

public class ArrayTest {
		public static void main(String[] args) {
				int[] int1 = {2,3,4,7};
				int[] int2 = {8,9,7,4};
				int[] int3 = {3,1,6,4};
				System.out.println(Arrays.toString(mergeAndSortJava8(int1, int2, int3)));
		}

		private static int[] mergeAndSortJava8(int[]... int3) {
				return Arrays.stream(int3)
						.flatMapToInt(Arrays::stream)
						.sorted()
						.toArray();
		}
}
