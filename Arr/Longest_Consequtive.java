package Striver.Arr;
// 128 leetcode (https://leetcode.com/problems/longest-consecutive-sequence/description/)

import java.util.Arrays;

public class Longest_Consequtive {
    public static void main(String[] args) {
        int[] arr = { 103, 4, 100, 1, 101, 2, 1, 3 };
        System.out.println(lonSeq(arr));
    }

    // brute force
    public static int lonSeq(int[] arr) {
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 1;
            while (ls(arr, x + 1)) {
                x++;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    private static boolean ls(int[] arr, int i) {
        boolean ans = false;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i) {
                return true;
            }
        }
        return false;
    }

    // better
    public static int better(int[] arr) {
        Arrays.sort(arr);
        int longest = 1;
        int curCon = 0;
        int lastSmaller = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 == lastSmaller) {
                curCon++;
                lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                lastSmaller = arr[i];
                curCon = 1;
            }
            longest = Math.max(longest, curCon);
        }
        return longest;
    }

    // optimal
    

}
