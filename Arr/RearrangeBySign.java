package Striver.Arr;
// 2149. Rearrange Array Elements by Sign

import java.util.Arrays;

public class RearrangeBySign {
    public static void main(String[] args) {
        int[] arr = { 3, 1, -2, -5, 2, -4 };
        rearrangeArray(arr);
        int n = arr.length / 2;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int j = 0;
        int k = 0;

        for (int i : arr) {
            if (i >= 0) {
                pos[j] = i;
                j++;
            }
            else{

                neg[k] = i;
                k++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[2 * i] = pos[i];
            arr[2 * i + 1] = neg[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    // optimized
    public static void rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int pos = 0;
        int neg = 1;
        for (int ele : nums) {
            if (ele >= 0) {
                ans[pos] = ele;
                pos+=2;
            } else {
                ans[neg] = ele;
                neg+=2;
            }
        }

        System.out.println(Arrays.toString(ans));
    }

}
