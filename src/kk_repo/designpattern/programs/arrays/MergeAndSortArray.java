package kk_repo.designpattern.programs.arrays;

import java.util.Arrays;

public class MergeAndSortArray {
    public static void main(String[] args) {
        mergeAndSortUsingCoreJava();
        mergeAndSort2ArraysUsingJava8();
        mergeAndSort3ArraysUsingJava8();
    }

    private static void mergeAndSortUsingCoreJava() {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        // Step 1: Merge both arrays
        int[] mergedArray = mergeArrays(arr1, arr2);

        // Step 2: Sort the merged array using Bubble Sort
        bubbleSort(mergedArray);

        // Print the sorted merged array
        //o/p : [1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("Merged Sorted Array Using Core Java: " + Arrays.toString(mergedArray));
    }
    // Merge both arrays
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        // Copy elements
        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        return merged;
    }
    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void mergeAndSort3ArraysUsingJava8() {
        int[] arr1 = {8, 5, 9};
        int[] arr2 = {4, 8, 2};
        int[] arr3 = {3, 1, 6};

        int[] mergedArray = mergeAndSortArrays(arr1, arr2, arr3);

        System.out.print("mergeAndSort3Arrays = ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
    private static void mergeAndSort2ArraysUsingJava8() {
        int[] arr1 = {8,5,9};
        int[] arr2 = {4,8,2};
        int[] mergedArray = mergeAndSortArrays(arr1, arr2);
        System.out.print("mergeAndSort2Arrays = ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeAndSortArrays(int[]... arrays) {
        return Arrays.stream(arrays)
              .flatMapToInt(Arrays::stream)
              .sorted()
              .toArray();
    }
}
