package com.hardik.javase;

/**
 * Java String equals() and equalsIgnoreCase() Method
 * 
 * The java string equals() method compares the two given strings based on the
 * content of the string. If any character is not matched, it returns false. If
 * all characters are matched, it returns true.
 * 
 * The String equalsIgnoreCase() method compares the two given strings on the
 * basis of content of the string irrespective of case of the string. It is like
 * equals() method but doesn't check case. If any character is not matched, it
 * returns false otherwise it returns true.
 * 
 * The String equals() method overrides the equals() method of Object class.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class EqualsEqualsIgnoreCase {
	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Java";
		String s3 = "JAVA";
		String s4 = "C++";

		// Equals() Method
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // false
		System.out.println(s1.equals(s4)); // false

		// EqualsIgnoreCase() Method
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		System.out.println(s1.equalsIgnoreCase(s3)); // false
		System.out.println(s1.equalsIgnoreCase(s4)); // false
	}
}