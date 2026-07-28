package Striver.Arr;

import java.util.Arrays;

//	find missing and repeating number
public class MissingAndRepeating {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 1, 7, 2 };
		System.out.println(Arrays.toString(approach1(arr)));
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
}
