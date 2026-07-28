package Striver.Arr;
//	20. leetcode

import java.util.*;

public class ValidParenthesis {
	public static void main(String[] args) {
		String parenString = "()[]{}";
		System.out.println(isValid(parenString));
	}

	static boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			}

			else {

				if (stack.isEmpty()) {
					return false;
				}

				if ((ch == ')' && stack.peek() == '(') || (ch == ']' && stack.peek() == '[')
						|| (ch == '}' && stack.peek() == '{')) {

					stack.pop();
				} else {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}
}
