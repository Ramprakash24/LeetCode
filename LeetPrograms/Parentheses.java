package LeetPrograms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Parentheses {

	public static boolean isValid(String s) {
		HashMap<Character, Character> match = new HashMap<Character, Character>();
		match.put(')', '(');
		match.put('}', '{');
		match.put(']', '[');
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
				continue;
			}
			if (stack.size() == 0 || match.get(s.charAt(i)) != stack.pop()) {
				return false;
			}
		}
		if (stack.size() == 0) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {

		boolean value = false;
		System.out.println("Enter the sequence of Parantheses:");
		Scanner in = new Scanner(System.in);
		String parentheses = in.nextLine();
		value = isValid(parentheses);
		if (value)
			System.out.println("Valid Parantheses");
		else
			System.out.println("NOT Valid Parantheses");
		/*
		 * //n=parentheses.length(); System.out.println(parentheses.charAt(0));
		 * if(parentheses.charAt(0) == parentheses.charAt(1))
		 * System.out.println("True");
		 */
		in.close();
	}

}
