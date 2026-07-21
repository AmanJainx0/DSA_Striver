package Striver.Arr;
import java.util.ArrayList;

public class Leaders {
    public static void main(String[] args) {
        int[] arr = { 10, 22, 12, 3, 0, 6 };
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        System.out.println(ans);
    }
}
