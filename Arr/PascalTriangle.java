package Striver.Arr;

import java.util.ArrayList;
import java.util.List;

//	118. Pascal's Triangle

/*
 * types of questions-
 * 
 * 1. given R & C tell the element at that place
 * 
 * 2. print any nth row of the pascal traingle
 * 
 * 3. given n , print the entire triangle
 *  
 */
public class PascalTriangle {
	public static void main(String[] args) {
		System.out.println(NcR(5 - 1, 3 - 1));

		System.out.println(nRowElements(5));
		
		System.out.println(generate(5));
	}
//	if the que says that the rows start from 1 then use NcR(n-1, r-1)

	static int NcR(int n, int r) {
		int res = 1;
		for (int i = 0; i < r; i++) {
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}

	static List<Integer> nRowElements(int n) {

	    ArrayList<Integer> ansArrayList = new ArrayList<>();

	    int ans = 1;
	    ansArrayList.add(ans);

	    for (int i = 1; i < n; i++) {
	        ans *= (n - i);
	        ans /= i;
	        ansArrayList.add(ans);
	    }

	    return ansArrayList;
	}

	public static List<List<Integer>> generate(int n) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		for (int i = 1; i <= n; i++) {
			ans.add(nRowElements(i));
		}

		return ans;

	}
}
