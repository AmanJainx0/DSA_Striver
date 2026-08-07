package Striver.Arr;

import java.util.ArrayList;

//	493. leetcode
public class ReversePairs {
	public static void main(String[] args) {
		int[] arr = { 40, 25, 19, 12, 9, 6, 2 };
		System.out.println(brute(arr));
		System.out.println(optimal(arr));
	}

	static int brute(int[] arr) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i <= n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > 2 * arr[j]) {
					count++;
				}
			}
		}
		return count;
	}

	static int optimal(int[] arr) {
		return mergeSort(arr, 0, arr.length - 1);

	}

	static int countPairs(int[] arr, int low, int mid, int high) {
		int right = mid + 1;
		int cnt = 0;
		for (int i = low; i <= mid; i++) {
			while (right <= high && arr[i] > 2L * arr[right]) {
				right++;
			}
			cnt += (right - (mid + 1));
		}
		return cnt;
	}

	static int mergeSort(int[] arr, int low, int high) {
		if (low >= high)
			return 0;

		int mid = low + (high - low) / 2;

		int cnt = 0;
		cnt += mergeSort(arr, low, mid);
		cnt += mergeSort(arr, mid + 1, high);
		cnt += countPairs(arr, low, mid, high);
		merge(arr, low, mid, high);

		return cnt;
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> list = new ArrayList<>();
		int left = low;
		int right = mid + 1;
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				list.add(arr[left]);
				left++;
			} else {
				list.add(arr[right]);
				right++;
			}
		}
		while (left <= mid) {
			list.add(arr[left]);
			left++;
		}
		while (right <= high) {
			list.add(arr[right]);
			right++;
		}
		for (int i = low; i <= high; i++) {
			arr[i] = list.get(i - low);
		}
	}
}