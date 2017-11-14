package com.hardik.javase;

import java.util.UUID;

/**
 * Generate Random String in Java using UUID class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class App {
	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("UUID from string : " + UUID.fromString("5231b533ba17478798a3f2df37de2aD7".replaceFirst(
				"(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}+)", "$1-$2-$3-$4-$5"))
				.toString());

		System.out.println("UUID from byte array : " + UUID.nameUUIDFromBytes(new byte[] { 'J', 'A', 'V', 'A' }));
		System.out.println("Random UUID : " + UUID.randomUUID());
	}

}
