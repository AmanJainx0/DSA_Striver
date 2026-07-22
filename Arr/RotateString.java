package Striver.Arr;

//	796 Rotate String 
public class RotateString {
	public static void main(String[] args) {
		String s = "abcde";
		String goal = "deab";
		System.out.println(rotateString(s, goal));
	}

	static boolean rotateString(String s, String goal) {
		if (s.length() != goal.length())
			return false;
		return (s + s).contains(goal);
	}
}
