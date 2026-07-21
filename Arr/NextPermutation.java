package Striver.Arr;
// 31: leetcode

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};

        permutation(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void permutation(int[] arr) {
        int index = -1;

        // Step 1: Find the first decreasing element from the end
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // If no such index exists, reverse the whole array
        if (index == -1) {
            rev(arr, 0, arr.length - 1);
            return;
        }

        // Step 2: Find the next greater element
        for (int i = arr.length - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                swap(arr, i, index);
                break;
            }
        }

        // Step 3: Reverse the suffix
        rev(arr, index + 1, arr.length - 1);
    }

    private static void rev(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}