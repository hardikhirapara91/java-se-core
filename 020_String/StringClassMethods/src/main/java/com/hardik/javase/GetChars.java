package com.hardik.javase;

/**
 * Java String getChars() Method
 * 
 * The java string getChars() method copies the content of this string into
 * specified char array.
 * 
 * Signature: public void getChars(int srcBeginIndex, int srcEndIndex, char[]
 * destination, int dstBeginIndex)
 * 
 * @author HARDIK HIRAPARA
 */
public class GetChars {
	public static void main(String[] args) {
	
		String str = new String("Hello World!,How are you?");
		char[] ch = new char[10];
		
		try {
			str.getChars(6, 16, ch, 0);
			System.out.println(ch);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}