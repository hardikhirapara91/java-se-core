package com.hardik.javase;

/**
 * Integer Literals
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class IntegerLiterals {

	public static void main(String[] args) {

		int b = 0b1010; // Stored Binary Value
		System.out.println("1010 in Decimal: " + b);

		int i = 123_456_7890; // Uses Underscore
		System.out.println(i);

		i = 12__34___567____890;
		System.out.println(i);

		int x = 0b1101_0101_0001_1010; // Underscore in Binary value
		System.out.println(x);
	}
}
