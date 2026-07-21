package Striver.Arr;

import java.util.Arrays;

import com.sun.org.apache.xpath.internal.axes.ReverseAxesWalker;

//  48. Rotate Image
public class RotateMatrix_Image {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		brute(arr);
		optimal(arr);
	}

//	brute force
	static void brute(int[][] arr) {
		int n = arr.length;
		int[][] ans = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ans[j][n - 1 - i] = arr[i][j];
			}
		}
		System.out.println(Arrays.deepToString(ans));

	}

//	optimal 
//	1. transpose the matrix
//	2. reverse each row
	static void optimal(int[][] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				swap(i, j, arr);
			}
		}
		for (int i = 0; i < n; i++) {
			reverse(arr, i);
		}
		System.out.println(Arrays.deepToString(arr));

	}

	static void reverse(int[][] arr, int row) {
		int n = arr.length;

		for (int j = 0; j < n / 2; j++) {
			int temp = arr[row][j];
			arr[row][j] = arr[row][n - 1 - j];
			arr[row][n - 1 - j] = temp;
		}
	}

	static void swap(int i, int j, int[][] arr) {
		int temp = arr[i][j];
		arr[i][j] = arr[j][i];
		arr[j][i] = temp;
		return;

	}
}
