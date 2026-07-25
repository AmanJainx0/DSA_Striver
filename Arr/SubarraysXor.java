package Striver.Arr;

import java.util.HashMap;

public class SubarraysXor {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 2, 6, 4 };
		int k = 6;
		System.out.println(brute(arr, k));
		System.out.println(better(arr, k));
		System.out.println(optimal(arr, k));
	}

	private static int brute(int[] arr, int a) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int xor = 0;
				for (int k = i; k <= j; k++) {
					xor ^= arr[k];
				}
				if (xor == a)
					count++;
			}
		}
		return count;
	}

	private static int better(int[] arr, int a) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int xor = 0;
			for (int j = i; j < arr.length; j++) {
				xor ^= arr[j];

				if (xor == a)
					count++;
			}
		}
		return count;
	}

	static int optimal(int[] arr, int a) {
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		int xor = 0;
		for (int i = 0; i < arr.length; i++) {
			xor ^= arr[i];
			if (map.containsKey(xor ^ a)) {
				count += map.get(xor ^ a);
			}
			map.put(xor, map.getOrDefault(xor, 0) + 1);
		}

		return count;
	}
}
