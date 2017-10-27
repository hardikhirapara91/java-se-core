package com.hardik.javase;

import java.util.regex.Pattern;

/**
 * Java Regular Expression Metacharacters Example
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {

		System.out.println("metacharacters d....(means digit)");
		// false (non-digit)
		System.out.println(Pattern.matches("\\d", "abc"));
		// true (digit and comes once)
		System.out.println(Pattern.matches("\\d", "1"));
		// false (digit but comes more than once)
		System.out.println(Pattern.matches("\\d", "4443"));
		// false (digit and char)
		System.out.println(Pattern.matches("\\d", "323abc"));

		System.out.println("metacharacters D....(means non-digit)");
		// false (non-digit but comes more than once)
		System.out.println(Pattern.matches("\\D", "abc"));
		// false (digit)
		System.out.println(Pattern.matches("\\D", "1"));
		// false (digit)
		System.out.println(Pattern.matches("\\D", "4443"));
		// false (digit and char)
		System.out.println(Pattern.matches("\\D", "323abc"));
		// true (non-digit and comes once)
		System.out.println(Pattern.matches("\\D", "m"));

		System.out.println("metacharacters D with quantifier....");
		// true (non-digit and may come 0 or more times)
		System.out.println(Pattern.matches("\\D*", "mak"));

	}
}
