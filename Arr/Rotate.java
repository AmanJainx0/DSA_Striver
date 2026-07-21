package Striver.Arr;
import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 1, 76, 54, 32 };
        // leftRot(arr);
        // leftKPlaces(arr, 4);
        // rotateRev(arr, 4);
        // rightRotate(arr, 4);
        rightKPlaces(arr, 5);
    }

    // left rotate by one place
    public static void leftRot(int[] arr) {
        int n = arr.length - 1;
        int last = arr[0];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n] = last;
        System.out.println(Arrays.toString(arr));
    }

    // left rotate by k places(brute force)
    public static void leftKPlaces(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];

        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - (n - k)];
        }

        System.out.println(Arrays.toString(arr));
    }

    // optimised method using reversal
    public static void rotateRev(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        rev(arr, 0, k - 1);
        rev(arr, k, n - 1);
        rev(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void rev(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return;
    }

    // left rotate by k places(brute force)
    public static void rightKPlaces(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] temp = new int[k];

        // Store last k elements
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        // Shift remaining elements to the right
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // Copy temp to beginning
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    // right rotate k times
    // first reverse the whole array then rev the first k elemnts and then reverse
    // the last n-k elemwnts
    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        rev(arr, 0, n - 1);
        rev(arr, 0, k - 1);
        rev(arr, k, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
