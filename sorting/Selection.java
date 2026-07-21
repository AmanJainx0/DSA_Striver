package Striver.sorting;
import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        int[] ans = selectionSort(arr);
        System.out.println(Arrays.toString(ans));;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            int min = i;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[min] > arr[j]) {
                    swap(arr, min, j);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
