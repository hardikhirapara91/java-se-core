package com.hardik.javase;

/**
 * Java String Class Demo
 * 
 * In java string is immutable. Java string is a object.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class StringDemo {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World!";
		String str3 = str1 + " " + str2;

		String str4 = new String("How are you?");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
