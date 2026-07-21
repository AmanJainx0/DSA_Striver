package Striver.recursion;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("the fact of " + n + " is: ");
		System.out.println(fact(n));

	}

	static int fact(int n) {
		if (n == 0)
			return 1;
		return n * fact(n - 1);
	}
}
