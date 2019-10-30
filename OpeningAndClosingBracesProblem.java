package info.katikireddy622.problems;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class OpeningAndClosingBracesProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		Stack<Character> stack = new Stack<Character>();

		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		hm.put('(', ')');
		hm.put('{', '}');
		hm.put('[', ']');
		hm.put(')', ')');
		hm.put(']', ']');
		hm.put('}', '}');

		char[] charArray = input.toCharArray();

		for (char c : charArray) {
			if (stack.isEmpty()) {
				stack.add(c);
			} else {
				char peeked = stack.peek();
				if (c == hm.get(peeked)) {
					char removed = stack.pop();
					System.out.println(removed);
				} else {
					stack.add(c);
				}
			}

		}
		if (stack.isEmpty()) {
			System.out.println("The Compiler is valid");
		} else {
			System.err.println("The Compiler failed to compute");
		}

	}
}
