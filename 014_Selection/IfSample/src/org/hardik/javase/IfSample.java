package org.hardik.javase;

/**
 * If Sample
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class IfSample {

	public static void main(String[] args) {

		int x = 10, y = 20;

		if (x < y) {
			System.out.println(x + " is less then " + y);
		}

		x *= 2; // Now x is 20

		if (x == y) {
			System.out.println(x + " is equals to " + y);
		}

		x *= 2; // Now x is 40

		if (x > y) {
			System.out.println(x + " is grater then " + y);
		}

		// Following statement is not execute
		if (x == y) {
			System.out.println(x + " is equals to " + y);
		}
	}
}
