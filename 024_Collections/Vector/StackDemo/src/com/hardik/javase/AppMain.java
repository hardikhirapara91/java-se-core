package com.hardik.javase;

import java.util.Stack;

/**
 * App Main Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class AppMain {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");

		System.out.println(stack.peek());
		System.out.println(stack.search("thre"));

		for (int i = 0; i < stack.size(); i++) {
			System.out.println(i + " : " + stack.get(i));
		}

		System.out.println(stack);
	}
}
