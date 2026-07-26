package Striver.Arr;

import java.util.*;

//	58. leetcode
public class WordLength {
	public static void main(String[] args) {
		String string = "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord(string));
	}static int lengthOfLastWord(String s) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        String ans = list.get(list.size() - 1);
        return ans.length();
    }
}
