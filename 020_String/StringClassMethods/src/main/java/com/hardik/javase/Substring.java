package com.hardik.javase;

/**
 * Java String substring() Method
 * 
 * The java string substring() method returns a part of the string.
 * 
 * We pass begin index and end index number position in the java substring
 * method where start index is inclusive and end index is exclusive. In other
 * words, start index starts from 0 whereas end index starts from 1.
 * 
 * If you don't specify endIndex, java substring() method will return all the
 * characters from startIndex.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Substring {
	public static void main(String[] args) {
		String s1 = "Java Programming Language";

		System.out.println(s1.substring(2, 4));
		System.out.println(s1.substring(2));
	}
}