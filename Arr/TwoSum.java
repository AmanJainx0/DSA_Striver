package Striver.Arr;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 8, 22, 4 };
        int target = 12;
        System.out.println(twoSum(arr, target));
    }

    public static boolean twoSum(int[] arr, int tar) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        int sum = 0;
        while (i < j) {
            sum = arr[i] + arr[j];
            if (sum < tar)
                i++;
            else if (sum > tar)
                j--;
            else
                return true;
        }
        return false;
    }
}
