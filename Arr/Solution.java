package Striver.Arr;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,3};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
    public static int[] removeDuplicates(int[] arr) {
        int count = 0;
        int i = 0;
        int j = 0;
        int zero = -1;
        while (i <= j && j<arr.length) {
            if (arr[i] == arr[j]) {
                count++;
                j++;
                if(count>=2){
                   zero = arr[j];
                }
            } else {
                i = j;
                count = 0;
            }
           
        }
        return arr;
    }
}
