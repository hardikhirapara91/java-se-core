package com.hardik.javase;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * Escape Special Characters in String
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
		String testStr = "< > \" &";

		System.out.println("Original String: " + testStr);
		System.out.println("Escaped String: " + StringEscapeUtils.escapeHtml(testStr));
	}
}
