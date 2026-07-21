package Striver.sorting;
public class Bubble {
    public static void main(String[] args) {

        int[] arr = { 64, 25, 12, 22, 11 };
        int n = arr.length;
        bubbleSort(arr, n);
        for (int ele : arr) {
            System.out.println(ele);
        }
    }

    public static void bubbleSort(int[] arr, int n) {
        for (int i = n - 1; i >= 1; i--){
             int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    didSwap = 1;
                }
            }
            if(didSwap == 0)
                break;
        }

    }

    public static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

}
