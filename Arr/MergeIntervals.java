package Striver.Arr;

import java.util.*;

//	56. leetcode
public class MergeIntervals {
	public static void main(String[] args) {
		int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		System.out.println("Brute:");
		System.out.println(Arrays.deepToString(brute(arr)));
		System.out.println("Optimal:");
		System.out.println(Arrays.deepToString(optimal(arr)));
	}

	static int[][] brute(int[][] arr) {
		int n = arr.length;

		Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

		ArrayList<int[]> ans = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int start = arr[i][0];
			int end = arr[i][1];

			if (!ans.isEmpty() && end <= ans.get(ans.size() - 1)[1]) {
				continue;
			}

			for (int j = i + 1; j < n; j++) {
				if (arr[j][0] <= end) {
					end = Math.max(end, arr[j][1]);
				} else {
					break;
				}
			}

			ans.add(new int[] { start, end });
		}

		return ans.toArray(new int[ans.size()][]);
	}

	static int[][] optimal(int[][] arr) {
		int n = arr.length;
		Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
		ArrayList<int[]> ans = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1)[1]) {
				ans.add(arr[i]);
			} else {
				ans.get(ans.size() - 1)[1] = Math.max(arr[i][1], ans.get(ans.size() - 1)[1]);

			}
		}
		return ans.toArray(new int[ans.size()][]);
	}
}
