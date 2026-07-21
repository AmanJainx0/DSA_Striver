package Striver.Arr;
import java.util.Arrays;

public class SortArrayof012 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        System.out.println(Arrays.toString(sor(arr)));
    }
// Dutch National Flag algorithm
    public static int[] sor(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr[mid] == 1)
                mid++;
            else {
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}
