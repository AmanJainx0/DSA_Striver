package Striver.Arr;
public class Check_sort_arr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        boolean ans = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                ans = true;
            } else {
                ans = false;
            }
        }
        System.out.println(ans);
    }
}
