package Striver.Arr;

import java.util.Arrays;

//	66. leetcode
public class PlusOne {
	public static void main(String[] args) {
		int[] arr = { 9, 9, 9, 9 };
		System.out.println(Arrays.toString(plusOne(arr)));
	}

	static int[] plusOne(int[] digits) {
		int num = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			} else {
				digits[i] = 0;

			}
		}
		int[] ans = new int[digits.length + 1];
		ans[0] = 1;
		return ans;
	}
}
