package Striver.Arr;

import java.util.HashMap;

//	560. Subarray Sum Equals K

//  subarray means the contiguous part of the array
public class NoSubarrayequalsum {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
		int k = 3;
		System.out.println(brute(arr, k));
		System.out.println(optimal(arr, k));

	}

	static int brute(int[] arr, int tar) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum == tar) {
					count++;
				}
			}
		}

		return count;
	}

//	optimal
//	using the prefix sum
	static int optimal(int[] arr, int tar) {
		int count = 0;
		int preSum = 0;

		HashMap<Integer, Integer> has = new HashMap<>();
		has.put(0, 1);

		for (int i = 0; i < arr.length; i++) {
			preSum += arr[i];

			int remove = preSum - tar;

			count += has.getOrDefault(remove, 0);

			has.put(preSum, has.getOrDefault(preSum, 0) + 1);
		}

		return count;
	}
}
