package Striver.Arr;
//	15. 3Sum

import java.util.*;

public class ThreeSum {
	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };
		System.out.println(brute(arr));
		System.out.println(better(arr));
		System.out.println(optimal(arr));
	}

	static List<List<Integer>> brute(int[] arr) {
		Set<List<Integer>> set = new HashSet<List<Integer>>();

		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						int[] ar = { arr[i], arr[j], arr[k] };
						Arrays.sort(ar);

						set.add(Arrays.asList(ar[0], ar[1], ar[2]));
					}
				}
			}
		}
		return new ArrayList<>(set);
	}

	static List<List<Integer>> better(int[] arr) {
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		for (int i = 0; i < arr.length; i++) {
			Set<Integer> haSet = new HashSet<Integer>();
			for (int j = i + 1; j < arr.length; j++) {
				int third = -(arr[i] + arr[j]);
				if (haSet.contains(third)) {
					int[] ar = { arr[i], arr[j], third };
					Arrays.sort(ar);
					set.add(Arrays.asList(ar[0], ar[1], ar[2]));
				}
				haSet.add(arr[j]);
			}
		}
		return new ArrayList<List<Integer>>(set);
	}

	static List<List<Integer>> optimal(int[] arr) {
		Arrays.sort(arr);
		List<List<Integer>> ansList = new ArrayList<List<Integer>>();
		for (int i = 0; i < arr.length; i++) {
			if (i > 0 && arr[i] == arr[i - 1])
				continue;
			int j = i + 1;
			int k = arr.length - 1;
			while (j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				if (sum < 0)
					j++;
				else if (sum > 0)
					k--;
				else {
//					int[] temp = { arr[j], arr[i], arr[k] };
					ansList.add(Arrays.asList(arr[j], arr[i], arr[k]));
					j++;
					k--;
					while (j < k && arr[j] == arr[j - 1])
						j++;
					while (j < k && arr[k] == arr[k + 1])
						k++;
				}
			}
		}
		return ansList;
	}
}
