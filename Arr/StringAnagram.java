package Striver.Arr;

import java.util.HashMap;

//	242. leetcode
public class StringAnagram {
	public static void main(String[] args) {
		System.out.println(check("aman", "nama"));
	}

	static boolean check(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int index1 = (s.charAt(i) - 'a');
			int index2 = (t.charAt(i) - 'a');

			arr[index1]++;
			arr[index2]--;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				return false;

		}
		return true;
	}
}
