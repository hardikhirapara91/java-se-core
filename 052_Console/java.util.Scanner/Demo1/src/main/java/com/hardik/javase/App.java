package com.hardik.javase;

import java.util.Scanner;

/**
 * Read input from console
 * 
 * In JDK 1.5, the developer starts to use java.util.Scanner to read system
 * input.
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

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("Enter something: ");
			String input = scanner.nextLine();

			if (input.equalsIgnoreCase("q")) {
				System.out.println("Exit!");
				System.exit(0);
			}

			System.out.println("input : " + input);
			System.out.println("-----------\n");
		}
	}
}
