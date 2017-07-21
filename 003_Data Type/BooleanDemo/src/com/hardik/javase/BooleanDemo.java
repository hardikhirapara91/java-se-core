package com.hardik.javase;

/**
 * Boolean Demo
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class BooleanDemo {

	public static void main(String[] args) {

		boolean b = false;
		System.out.println(b);

		b = true;
		System.out.println(b);

		if (b)
			System.out.println("b is true.");

		b = false;
		if (b)
			System.out.println("This is not execute.");

		if (10 > 9)
			System.out.println("10 > 9");

	}
}
