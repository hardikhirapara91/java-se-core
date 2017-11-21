package com.hardik.javase;

/**
 * Java String CodePointAt() Method
 * 
 * The java string CodePointMethod() method returns a ascii char value at the given index
 * number. The index number starts from 0.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class CharAt {
	public static void main(String[] args) {
		String name = "Java Programming";
		int i = name.codePointAt(2);// returns the char ascii value at the 2nd index
		System.out.println(i);
	}
}
