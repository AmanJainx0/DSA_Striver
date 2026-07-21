package Striver.Arr;

import java.util.Arrays;

public class SetMatrixZero {
	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 0, 1, 1 }, { 0, 1, 1, 0, 1 }, { 0, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 }, { 1, 0, 1, 0, 1 } };
		System.out.println(Arrays.deepToString(setZero(arr)));
	}
//	better approach
	static int[][] setZero(int[][] arr) {
		int[] row = new int[arr.length];
		int[] col = new int[arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 0) {
					col[j] = 1;
					row[i] = 1;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (row[i]==1 || col[j]==1) {
					arr[i][j] = 0;
				}
			}
		}
		return arr;
	}
}
