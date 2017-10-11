package com.hardik.javase;

import java.util.UUID;

/**
 * Performance testing of StringBuffer & StringBuilder
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	/**
	 * App Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// String-Buffer
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");

		for (int i = 0; i < 10000; i++)
			sb.append(UUID.randomUUID().toString());

		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

		// String-Builder
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Java");

		for (int i = 0; i < 10000; i++)
			sb2.append(UUID.randomUUID().toString());

		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	}

}
