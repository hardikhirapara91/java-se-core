package com.hardik.javase;

/**
 * Java String CharAt() Method
 * 
 * The java string charAt() method returns a char value at the given index
 * number. The index number starts from 0. It returns
 * StringIndexOutOfBoundsException if given index number is greater than this
 * string or negative index number.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class CharAt {
	public static void main(String[] args) {
		String name = "Java Programming";
		char ch = name.charAt(2);// returns the char value at the 2nd index
		System.out.println(ch);

		// StringIndexOutOfBoundsException with charAt()
		ch = name.charAt(25);
		System.out.println(ch);
	}
}
