package Striver.Arr;

import java.util.HashMap;

//	13. leetcode
public class RomanToInteger {
	public static void main(String[] args) {
		System.out.println(romanToInt("MXIVLLLLLCDMCIIVDM"));
	}

	static int romanToInt(String s) {
		HashMap<Character, Integer> mppHashMap = new HashMap<Character, Integer>();
		mppHashMap.put('I', 1);
		mppHashMap.put('V', 5);
		mppHashMap.put('X', 10);
		mppHashMap.put('L', 50);
		mppHashMap.put('C', 100);
		mppHashMap.put('D', 500);
		mppHashMap.put('M', 1000);
		int total = 0;
		for (int i = 0; i < s.length(); i++) {
			int curent = mppHashMap.get(s.charAt(i));
			if (i < s.length() - 1) {
				int next = mppHashMap.get(s.charAt(i + 1));
				if (curent < next) {
					total -= curent;
				} else {
					total += curent;
				}
			} else {
				total += curent;
			}
		}
		return total;
	}
}
