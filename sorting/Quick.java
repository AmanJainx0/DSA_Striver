package Striver.sorting;
import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = { 84, 95, 82, 39, 74, 94, 83 };
        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));

    }

    public static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = ind(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
        return arr;
    }

    public static int ind(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high-1) {
                i++;
            }
            while (arr[j] > pivot && j >= low+1) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    public static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
