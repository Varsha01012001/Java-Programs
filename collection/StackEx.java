package collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Gauva");
		stack.push("Mango");
		stack.push("Gauva");
		stack.push("Apple");
		stack.push("Banana");
		stack.push(null);

		System.out.println("Stack :" + stack);
		System.out.println("removing element :" + stack.pop());
		System.out.println("stack after removing :" + stack);
		System.out.println("search Mango : " + stack.search("Mango"));
		System.out.println("Search Watermelon : " + stack.search("Watermelon"));
	}
}
