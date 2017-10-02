package com.hardik.javase;

/**
 * Scope and life time of variables.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ScopeExample {

	public static void main(String[] args) {

		int x = 10;

		if (x == 10) { // Start a new scope

			int y = 20;

			System.out.println("x: " + x);
			System.out.println("y: " + y);

			x *= y;
		} // End if conditions scope

		System.out.println("x: " + x);
		// System.out.println("y: " + y); // Error! y not known here
	}

}
