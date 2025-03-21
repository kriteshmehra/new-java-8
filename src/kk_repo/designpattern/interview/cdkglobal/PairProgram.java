package kk_repo.designpattern.interview.cdkglobal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairProgram {
		public static void main(String[] args) {
				List<Integer> list = Arrays.asList(1, 2, 3, 5, 7, 8, 9, 12, 15);
				int target = 20;
				Set<Integer> seen = new HashSet<>();

				for (int num : list) {
						int complement = target - num;
						if (seen.contains(complement)) {
								System.out.println("Pair: (" + num + ", " + complement + ")");
						}
						seen.add(num);
				}
		}
}
