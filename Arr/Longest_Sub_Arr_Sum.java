package Striver.Arr;
import java.util.HashMap;

public class Longest_Sub_Arr_Sum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 1};
        System.out.println(longestSub(arr, 3));
        System.out.println(betterSol(arr, 3));
    }

    public static int longestSub(int[] arr, int k) {
        int longe = 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right < arr.length) {
            sum += arr[right];
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                longe = Math.max(longe, right - left + 1);
            }
            right++;
            // if (right < arr.length)
        }
        return longe;
    }

    public static int betterSol(int[] arr, int k) {
    HashMap<Integer, Integer> hash = new HashMap<>();

    int sum = 0;
    int len = 0;

    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];

        if (sum == k) {
            len = Math.max(len, i + 1);
        }

        int rem = sum - k;

        if (hash.containsKey(rem)) {
            int length = i - hash.get(rem);
            len = Math.max(len, length);
        }

        // Store only the first occurrence of the prefix sum
        if (!hash.containsKey(sum)) {
            hash.put(sum, i);
        }
    }

    return len;
}
}
