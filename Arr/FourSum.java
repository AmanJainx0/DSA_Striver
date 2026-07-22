package Striver.Arr;

import java.util.*;

//	18. 4Sum leetcode 
public class FourSum {
	public static void main(String[] args) {
		int[] arr = { 1, 0, -1, 0, -2, 2 };
		System.out.println(brute(arr, 0));
		System.out.println(better(arr, 0));
		System.out.println(optimal(arr, 0));

	}

	static List<List<Integer>> brute(int[] arr, int target) {
		Set<List<Integer>> set = new HashSet<>();
		for (int i = 0; i < arr.length - 3; i++) {
			for (int j = i + 1; j < arr.length - 2; j++) {
				for (int k = j + 1; k < arr.length - 1; k++) {
					for (int c = k + 1; c < arr.length; c++) {
						long sum = (long) arr[i] + arr[j] + arr[k] + arr[c];

						if (sum == target) {
							int[] temp = { arr[i], arr[j], arr[k], arr[c] };
							Arrays.sort(temp);
							set.add(Arrays.asList(temp[0], temp[1], temp[2], temp[3]));
						}
					}
				}
			}
		}
		return new ArrayList<>(set);
	}

	static List<List<Integer>> better(int[] arr, int target) {
		Set<List<Integer>> anLists = new HashSet<List<Integer>>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				Set<Integer> tempIntegers = new HashSet<Integer>();
				for (int k = j + 1; k < arr.length; k++) {
					long fourth = (long) target - arr[i] - arr[j] - arr[k];
					if (tempIntegers.contains((int) fourth)) {
						int[] ar = { arr[i], arr[j], arr[k], (int) fourth };
						Arrays.sort(ar);
						anLists.add(Arrays.asList(ar[0], ar[1], ar[2], ar[3]));
					}
					tempIntegers.add(arr[k]);
				}
			}
		}
		return new ArrayList<>(anLists);
	}

	static List<List<Integer>> optimal(int[] arr, int target) {
		List<List<Integer>> ansList = new ArrayList<List<Integer>>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (i > 0 && arr[i] == arr[i - 1])
				continue;
			for (int j = i + 1; j < arr.length; j++) {
				if (j > i + 1 && arr[j] == arr[j - 1]) {
					continue;
				}
				int k = j + 1;
				int l = arr.length - 1;
				while (k < l) {
					long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
					if (sum < target)
						k++;
					else if (sum > target)
						l--;
					else {
						ansList.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
						k++;
						l--;
						while (k < l && arr[k] == arr[k - 1])
							k++;
						while (k < l && arr[l] == arr[l + 1])
							l--;
					}
				}
			}
		}
		return ansList;
	}
}
