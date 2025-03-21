package kk_repo.designpattern.programs.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairSum {
    public static List<int[]> findPairs(int[] arr, int targetSum) {
        List<int[]> pairs = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>(); // Map to store element -> index mapping

        for (int i = 0; i < arr.length; i++) {
            int complement = targetSum - arr[i];
            if (map.containsKey(complement)) {
                pairs.add(new int[]{map.get(complement), i});
            }
            map.put(arr[i], i);
        }
        System.out.println(map);
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 2, 9, 7, 5, 6};
        int targetSum = 10;
        List<int[]> pairs = findPairs(arr, targetSum);

        if (pairs.isEmpty()) {
            System.out.println("No pairs found with sum " + targetSum);
        } else {
            System.out.println("Pairs with sum " + targetSum + ":");    // (2, 4)  (0, 5)  (1, 7)
            for (int[] pair : pairs) {
                System.out.println("(" + pair[0] + ", " + pair[1] + ")");
            }
        }
    }
}