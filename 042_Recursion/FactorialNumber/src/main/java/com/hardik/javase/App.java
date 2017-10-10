package com.hardik.javase;

/**
 * Java Recursion Factorial Example
 * 
 * @author HARDIK HIRAPARA
 */
public class App {

	/**
	 * Recursion factorial method
	 */
	static int factorial(int no) {
		if (no == 1) {
			return no;
		} else {
			return (no * factorial(no - 1));
		}
	}

	/**
	 * App Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Factorial 5 is:" + factorial(5));
	}

}
