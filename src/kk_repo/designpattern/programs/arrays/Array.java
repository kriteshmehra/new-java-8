package kk_repo.designpattern.programs.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        int[] arr1 = {9,6,3,0,3,4,5,0,0};
        usingList(arr1);
        usingOnlyArray(arr1);

    }
//o/p :- [0, 0, 0, 9, 6, 3, 3, 4, 5]
    private static void usingOnlyArray(int[] arr1) {
        int[] arr2 = new int[arr1.length];
        int index = 0;
        for (int i=0; i<arr1.length; i++) {
            if (arr1[i] == 0) {
                arr2[index++] = arr1[i];
            }
        }
        for (int i=0; i<arr1.length; i++) {
            if (arr1[i] != 0) {
                arr2[index++] = arr1[i];
            }
        }
        System.out.println(Arrays.toString(arr2)); //o/p :- [0, 0, 0, 9, 6, 3, 3, 4, 5]
    }

    private static void usingList(int[] arr1) {
        List<Integer> ls1 = new ArrayList<>();
        // Add the zero elements to ls1 at the end
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 0) {
                ls1.add(arr1[i]);
            }
        }
        // Iterate through the array and add non-zero elements to ls1
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != 0) {
                ls1.add(arr1[i]);
            }
        }
        System.out.println(Arrays.toString(ls1.toArray())); //o/p :- [0, 0, 0, 9, 6, 3, 3, 4, 5]

    }
}
