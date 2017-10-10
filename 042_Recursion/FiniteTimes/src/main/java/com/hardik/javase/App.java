package com.hardik.javase;

/**
 * Java Array Copy Example
 * 
 * @author HARDIK HIRAPARA
 */
public class App {

	private static int counter = 0;

	/**
	 * Recursion print method
	 */
	static void print() {
		System.out.println("Print method calling:" + counter);
		counter++;

		if (counter <= 1000)
			print(); // Method call itself

	}

	/**
	 * App Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		print();
	}

}
