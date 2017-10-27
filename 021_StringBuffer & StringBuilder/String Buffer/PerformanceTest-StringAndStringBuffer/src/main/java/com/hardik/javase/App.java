package com.hardik.javase;

import java.util.UUID;

/**
 * Performance testing of String & StringBuffer
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	/**
	 * Concat in String Class
	 */
	public static String concatInString() {
		String content = "Hello World";

		for (int i = 0; i < 1000; i++) {
			content = content.concat(UUID.randomUUID().toString());
		}

		return content;
	}

	/**
	 * Concat in StringBuffer Class
	 */
	public static String concatInStringBuffer() {
		StringBuffer content = new StringBuffer("Hello World");
		for (int i = 0; i < 1000; i++) {
			content = content.append(UUID.randomUUID().toString());
		}
		return content.toString();
	}

	/**
	 * App Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Long startTime = System.currentTimeMillis();

		// First call to concatInString() method
		concatInString();
		System.out
				.println("Time taken by concatInString() method: " + (System.currentTimeMillis() - startTime) + " ms.");

		// Second call to concatInStringBuffer() method
		startTime = System.currentTimeMillis();
		concatInStringBuffer();
		System.out.println(
				"Time taken by concatInStringBuffer() method: " + (System.currentTimeMillis() - startTime) + " ms.");

	}

}
