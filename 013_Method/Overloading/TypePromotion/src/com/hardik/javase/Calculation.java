package com.hardik.javase;

/**
 * Calculation Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Calculation {

	/**
	 * Addition integer and double values
	 * 
	 * @param i
	 * @param d
	 */
	public void sum(int i, double d) {
		System.out.println("Sum: " + (i + d));
	}

	/**
	 * Exception: The method sum(int, double) is ambiguous for the type
	 * Calculation
	 * 
	 * @param d
	 * @param i
	 */
	public void sum(double d, int i) {
		System.out.println("Sum: " + (i + d));
	}

	/**
	 * Addition three integer values
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public void sum(int a, int b, int c) {
		System.out.println("Sum: " + (a + b + c));
	}
}
