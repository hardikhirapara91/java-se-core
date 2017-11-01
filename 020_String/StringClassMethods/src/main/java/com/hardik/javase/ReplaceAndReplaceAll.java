package com.hardik.javase;

/**
 * Java String replace() and replaceAll() Method
 * 
 * The java string replace() method returns a string replacing all the old char
 * or CharSequence to new char or CharSequence.
 * 
 * The java string replaceAll() method returns a string replacing all the
 * sequence of characters matching regex and replacement string.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ReplaceAndReplaceAll {
	public static void main(String[] args) {

		/**
		 * Replace()
		 */
		String s1 = "Java is the best programming language of computer science.";

		String replaceString = s1.replace('a', '*');
		System.out.println(replaceString);

		replaceString = s1.replace("is", "was");
		System.out.println(replaceString);

		/**
		 * ReplaceAll()
		 */
		replaceString = s1.replaceAll("e", "@");
		System.out.println(replaceString);

		replaceString = s1.replaceAll("\\s", "");
		System.out.println(replaceString);
	}
}