package com.hardik.javase;

/**
 * Java String toCharArray() Method
 * 
 * The java string toCharArray() method converts this string into character
 * array. It returns a newly created character array, its length is similar to
 * this string and its contents are initialized with the characters of this
 * string.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ToCharArray {
	public static void main(String[] args) {

		String s1 = "Java";
	
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

	}
}