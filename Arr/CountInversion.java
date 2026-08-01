package Striver.Arr;

import java.util.ArrayList;

public class CountInversion {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 2, 4, 1 };
		System.out.println(brute(arr));
		System.out.println(optimal(arr));
	}

	private static int brute(int[] arr) {
		int count = 0;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j])
					count++;
			}
		}
		return count;
	}

	static int optimal(int[] arr) {
		int n = arr.length;
		return mergeSort(arr, 0, n - 1);

		
	}

	public static int mergeSort(int[] arr, int low, int high) {
		int cnt = 0;
		if (low >= high) {
			return cnt;
		}
		int mid = low + (high - low) / 2;
		cnt += mergeSort(arr, low, mid);
		cnt += mergeSort(arr, mid + 1, high);
		cnt += merge(arr, low, mid, high);
		return cnt;
	}

	public static int merge(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> list = new ArrayList<>();
		int left = low;
		int right = mid + 1;
		int cnt = 0;
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				list.add(arr[left]);
				left++;
			} else {
				list.add(arr[right]);
				cnt += (mid - left + 1);
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
		return cnt;
	}
}
