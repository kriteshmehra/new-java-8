package kk_repo.designpattern.programs.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByOccurrence {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(2, 5, 2,7, 6, 8,7, 5, 8, 7,8,7);
        System.out.println("Input: " + input);
        List<Integer> output = sortByOccurrence(input);
        System.out.println("Output: " + output);
    }

    public static List<Integer> sortByOccurrence(List<Integer> list) {
        // Count occurrences of each element
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int num : list) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        // Sort the list based on occurrences
        list.sort(Comparator.comparingInt((Integer a) -> occurrences.get(a)).thenComparingInt(list::indexOf));

        return list;
    }

}
