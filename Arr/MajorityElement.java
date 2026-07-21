package Striver.Arr;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 3, 3, 1, 2, 2, 1 };

        System.out.println(optimal(arr));
        // int n = 2;
        // int ans = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     int count = 0;
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[j] == arr[i]) {
        //             count++;
        //         }
        //     }
        //     if (count > (n / 2))
        //         ans = arr[i];
        // }
        // System.out.println(ans);
    }

    // optimal
    // moore's voting algo
    public static int optimal(int[] arr) {
        int count = 0;
        int ele = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count++;
                ele = arr[i];
            } else if (arr[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        int cnt1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele)
                cnt1++;

        }
        if (cnt1 > (arr.length / 2)) {
            return ele;

        }
        return -1;

    }
}
