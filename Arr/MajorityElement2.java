package Striver.Arr;

import java.lang.classfile.instruction.ReturnInstruction;
import java.util.*;

//	229 Majority Element 2 leetcode
public class MajorityElement2 {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 3, 3, 2, 2, 2 };
		System.out.println(brute(arr));
		System.out.println(better(arr));
		System.out.println(optimal(arr));
	}

	static ArrayList<Integer> brute(int[] arr) {
		ArrayList<Integer> ansArrayList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (ansArrayList.size() == 0 || ansArrayList.get(0) != arr[i]) {
				int count = 0;
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] == arr[i])

					{
						count++;
					}

				}
				if (count > (arr.length / 3)) {
					ansArrayList.add(arr[i]);
				}
			}
			if (ansArrayList.size() == 2)
				break;
		}
		return ansArrayList;
	}

	static List<Integer> better(int[] arr) {
		HashMap<Integer, Integer> mppHashMap = new HashMap<Integer, Integer>();
		ArrayList<Integer> ansArrayList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			mppHashMap.put(arr[i], mppHashMap.getOrDefault(arr[i], 0) + 1);
			if (mppHashMap.get(arr[i]) == (arr.length / 3) + 1) {
				ansArrayList.add(arr[i]);
			}
		}
		return ansArrayList;
	}

	static ArrayList<Integer> optimal(int[] arr) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int c1 = 0, c2 = 0, el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (c1 == 0 && arr[i] != el2) {
				c1 = 1;
				el1 = arr[i];
			} else if (c2 == 0 && arr[i] != el1) {
				c2 = 1;
				el2 = arr[i];
			} else if (el1 == arr[i]) {
				c1++;
			} else if (el2 == arr[i]) {
				c2++;
			} else {
				c1--;
				c2--;
			}

		}
		int cn1 = 0, cn2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (el1 == arr[i])
				cn1++;
			if (el2 == arr[i])
				cn2++;
		}
		int min = (arr.length / 3) + 1;
		if (cn1 >= min)
			ans.add(el1);
		if (cn2 >= min)
			ans.add(el2);
		return ans;
	}
}
