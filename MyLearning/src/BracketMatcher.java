

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BracketMatcher {

	public static void main(String args[]) {
		Stack<Character> stack = new Stack<Character>();
		int count = 0;
		try {
			Scanner sc = new Scanner(new File("input/inputString.txt"));
			while (sc.hasNext()) {
				String str = sc.nextLine();
				int i = 0, strLength = str.length();

				for (i = 0; i < strLength; i++) {
					char ch = str.charAt(i);
					if (ch == '(' || ch == '{' || ch == '<' || ch == '[') {
						stack.push(ch);
					} else if (ch == ')' || ch == '}' || ch == '>' || ch == ']') {
						if (stack.isEmpty() == false) {
							stack.pop();
							count++;
						}
					}

				}
			}
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (stack.isEmpty()) {
			System.out.println("Balanced");
			System.out.println("matching pairs:" + count);
		} else {
			System.out.println("Not balanced");
			System.out.println("matching pairs:" + count);
		}
	}
}