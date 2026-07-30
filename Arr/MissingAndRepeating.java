package Striver.Arr;

import java.util.*;

//	find missing and repeating number
public class MissingAndRepeating {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 1, 7, 2 };
		System.out.println(Arrays.toString(approach1(arr)));
		System.out.println(Arrays.toString(approach2(arr)));
		System.out.println(Arrays.toString(approach3(arr)));
		System.out.println(Arrays.toString(approach4(arr)));
	}

	static int[] approach1(int[] arr) {
		int repeating = -1;
		int missing = -1;

		for (int i = 1; i <= arr.length; i++) {

			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					count++;
				}
			}

			if (count == 2) {
				repeating = i;
			} else if (count == 0) {
				missing = i;
			}

			if (repeating != -1 && missing != -1) {
				break;
			}
		}

		return new int[] { repeating, missing };
	}

	static int[] approach2(int[] arr) {
		int n = arr.length;
		int[] hash = new int[n + 1];
		for (int i = 0; i < n; i++) {
			hash[arr[i]]++;
		}
		int repeating = -1;
		int missing = -1;
		for (int i = 1; i <= n; i++) {
			if (hash[i] == 2) {
				repeating = i;
			} else if (hash[i] == 0) {
				missing = i;
			}
			if (repeating != -1 && missing != -1) {
				break;
			}
		}
		return new int[] { repeating, missing };
	}

	static int[] approach3(int[] arr) {
		int n = arr.length;
		long sn = (n * (n + 1)) / 2;
		long sn2 = (n * (n + 1) * (2 * n + 1)) / 6;
		long s = 0, s2 = 0;

		for (int i = 0; i < n; i++) {
			s += arr[i];
			s2 += (long) arr[i] * (long) arr[i];
		}
		long val1 = (s - sn); // x-y = val1
		long val2 = (s2 - sn2);// x^2 -y^2 = val2 0r (x+y)(x-y) = val2
		val2 = val2 / val1; // x+y = val2/val1 or x+y = val2 / (x-y)

		long x = (val1 + val2) / 2;
		long y = x - val1;

		return new int[] { (int) (x), (int) (y) };

	}

	static int[] approach4(int[] arr) {
	    int n = arr.length;

	    // XOR of all array elements and numbers from 1 to n
	    int xr = 0;
	    for (int i = 0; i < n; i++) {
	        xr ^= arr[i];
	        xr ^= (i + 1);
	    }

	    // Find the rightmost set bit
	    int bitNo = 0;
	    while ((xr & (1 << bitNo)) == 0) {
	        bitNo++;
	    }

	    int zero = 0;
	    int one = 0;

	    // Divide array elements into two groups
	    for (int i = 0; i < n; i++) {
	        if ((arr[i] & (1 << bitNo)) != 0) {
	            one ^= arr[i];
	        } else {
	            zero ^= arr[i];
	        }
	    }

	    // Divide numbers from 1 to n into two groups
	    for (int i = 1; i <= n; i++) {
	        if ((i & (1 << bitNo)) != 0) {
	            one ^= i;
	        } else {
	            zero ^= i;
	        }
	    }

	    // Determine which is repeating and which is missing
	    int count = 0;
	    for (int i = 0; i < n; i++) {
	        if (arr[i] == zero) {
	            count++;
	        }
	    }

	    if (count == 2) {
	        return new int[] { zero, one };
	    } else {
	        return new int[] { one, zero };
	    }
	}
}
