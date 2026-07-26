package Striver.Arr;

import java.util.HashMap;
import java.util.HashSet;

//	771. leetcode
public class StonesAndJewels {
	public static void main(String[] args) {
		String jewel = "aA", stones = "aAAbbbb";
		System.out.println(numJewelsInStones(jewel, stones));
		System.out.println(optimal(jewel, stones));
	}

	public static int numJewelsInStones(String jewels, String stones) {
		HashMap<Character, Integer> mpp = new HashMap<Character, Integer>();
		int count = 0;
		for (int i = 0; i < stones.length(); i++) {
			mpp.put(stones.charAt(i), mpp.getOrDefault(stones.charAt(i), 0) + 1);
		}
		for (int i = 0; i < jewels.length(); i++) {
			count += mpp.getOrDefault(jewels.charAt(i), 0);
		}
		return count;

	}

	static int optimal(String jewels, String stones) {
		HashSet<Character> sCharacters = new HashSet<Character>();
		int count = 0;
		for (char c : jewels.toCharArray()) {
			sCharacters.add(c);
		}
		for (char c : stones.toCharArray()) {
			if (sCharacters.contains(c))
				count++;
		}
		return count;
	}
}
