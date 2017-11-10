package com.hardik.javase;

/**
 * Read input from console
 * 
 * In JDK 1.6, the developer starts to switch to the more simple and powerful
 * java.io.Console class.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class App {
	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		while (true) {

			System.out.println("Enter something: ");
			String input = System.console().readLine();

			if (input.equalsIgnoreCase("q")) {
				System.out.println("Exit!");
				System.exit(0);
			}

			System.out.println("input : " + input);
			System.out.println("-----------\n");
		}
	}
}
