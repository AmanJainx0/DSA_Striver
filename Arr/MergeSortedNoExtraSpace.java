package Striver.Arr;

import java.util.Arrays;

public class MergeSortedNoExtraSpace {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 0, 2, 6, 8, 9 };
		optimal1(arr1, arr2, arr1.length, arr2.length);
		optimal2(arr1, arr2, arr1.length, arr2.length);

	}

	static void optimal1(int[] arr1, int[] arr2, int n, int m) {
		int left = arr1.length - 1;
		int right = 0;
		while (left >= 0 && right < m) {
			if (arr1[left] > arr2[right]) {
				swap(arr1, left, arr2, right);
				left--;
				right++;
			} else {
				break;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

	static void optimal2(int[] arr1, int[] arr2, int n, int m) {
		int len = (arr1.length + arr2.length);
		int gap = (len / 2) + (len % 2);
		while (gap > 0) {
			int left = 0;
			int right = left + gap;
			while (right < len) {

				// arr1 and arr1
				if (left < n && right < n) {
					if (arr1[left] > arr1[right])
						swap(arr1, left, arr1, right);
				}

				// arr1 and arr2
				else if (left < n && right >= n) {
					if (arr1[left] > arr2[right - n])
						swap(arr1, left, arr2, right - n);
				}

				// arr2 and arr2
				else {
					if (arr2[left - n] > arr2[right - n])
						swap(arr2, left - n, arr2, right - n);
				}

				left++;
				right++;
			}
			if (gap == 1)
				break;
			gap = (gap / 2) + (gap % 2);
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

	static void swap(int[] arr1, int i, int[] arr2, int j) {
		int temp = arr1[i];
		arr1[i] = arr2[j];
		arr2[j] = temp;
	}
}
