package Striver.Arr;

import java.util.Arrays;

//	217 leetcode
public class DuplicateElementdetect {
	public static void main(String[] args) {
		int[] arr = { 6,4,8,2,1,34,9,67};
		System.out.println(detect(arr));
	}
	static boolean detect(int[] arr) {
		Arrays.sort(arr);
		int i = 0;
		int j = i+1;
		while(j<arr.length) {
			if(arr[i] == arr[j])return true;
			i++;
			j++;
		}
		return false;
	}
}
