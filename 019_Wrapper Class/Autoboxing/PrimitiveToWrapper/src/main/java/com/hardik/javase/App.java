package com.hardik.javase;

/**
 * Wrapper Class Example
 * 
 * Converting primitive to Object is called Autoboxing
 * 
 */
public class App {
	public static void main(String[] args) {

		// Converting int to Integer
		int i = 10;

		// Method-1
		Integer i1 = new Integer(i);
		System.out.println(i1);

		// Method-2
		Integer i2 = Integer.valueOf(i);
		System.out.println(i2);

		// Method-2
		Integer i3 = i; // compiler will write Integer.valueOf(i111111111)
						// internally
		System.out.println(i3);

	}
}
