package com.hardik.javase;

/**
 * Anonymous Object
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class AnnonymousObject {

	/**
	 * Calculate Factorial
	 * 
	 * @param no
	 */
	public void calcuateFactorial(int no) {

		int fact = 1;

		for (int i = 0; i < no; i++) {
			fact += fact * i;
		}

		System.out.println("Factorial: " + fact);
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new AnnonymousObject().calcuateFactorial(5);
	}
}
