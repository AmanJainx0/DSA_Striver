package Striver.sorting;
public class Inertion {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        int n = arr.length;
        insertionSort(arr, n);
        for (int ele : arr) {
            System.out.println(ele);

        }
    }

    public static void insertionSort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    public static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
