package com.hardik.javase;

/**
 * HashCode testing of String & StringBuffer
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

		// String
		System.out.println("Hash-Code testing of String class.");
		String string = "Hello";
		System.out.println("String Hash-Code Before: " + string.hashCode());
		string = string + " World.";
		System.out.println("String Hash-Code After: " + string.hashCode());

		// StringBuffer
		StringBuffer stringBuffer = new StringBuffer("Hello");
		System.out.println("StringBuffer Hash-Code Before: " + stringBuffer.hashCode());
		stringBuffer.append(" World.");
		System.out.println("StringBuffer Hash-Code After: " + stringBuffer.hashCode());
	}

}
