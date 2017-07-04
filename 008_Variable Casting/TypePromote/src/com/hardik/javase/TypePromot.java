package com.hardik.javase;

/**
 * Type Promote in Expression
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class TypePromot {

	public static void main(String[] args) {

		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50_000;
		float f = 5.67f;
		double d = 0.1234;
		double result = (f * b) + (i / c) - (d * s);

		System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
		System.out.println("result = " + result);

	}

}
