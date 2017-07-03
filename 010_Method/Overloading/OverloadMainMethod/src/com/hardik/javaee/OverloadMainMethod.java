package com.hardik.javaee;

/**
 * Overload main method
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class OverloadMainMethod {

	/**
	 * Main method with no-parameter
	 */
	public static void main() {
		System.out.println("No Parameters.");
	}

	/**
	 * Main method with one integer parameter
	 * 
	 * @param a
	 */
	public static void main(int a) {
		System.out.println("One Parameter: " + a);
	}

	/**
	 * Main method with one string parameter
	 * 
	 * @param str
	 */
	public static void main(String str) {
		System.out.println("String Parameter: " + str);
	}

	/**
	 * Main method with two string array parameter
	 * 
	 * @param args
	 */
	public static void main(String[] args, String[] argv) {
		// ARGS
		for (String string : args) {
			System.out.print(string + " ");
		}
		// ARGV
		for (String string : argv) {
			System.out.print(string + " ");
		}
	}

	/**
	 * Main method with one string array parameter
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		main();
		main(10);
		main("Hello World!");
		main(new String[] { "One", "Two", "Three" }, new String[] { "Four", "Five", "Six" });
	}

}
