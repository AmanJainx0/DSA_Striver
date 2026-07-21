package Striver.sorting;
import java.util.ArrayList;
import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = { 84, 95, 82, 39, 74, 94, 83 };
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));

    }

    public static int[] mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return arr;
        }
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
        return arr;
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
    }
}
