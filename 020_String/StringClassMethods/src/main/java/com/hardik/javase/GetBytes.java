package com.hardik.javase;

/**
 * Java String getBytes() Method
 * 
 * The java string getBytes() method returns the byte array of the string. In
 * other words, it returns sequence of bytes.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class GetBytes {
	public static void main(String[] args) {

		String str = "JAVA-PROGRAMMING";
		byte[] byteArr = str.getBytes();

		for (int i = 0; i < byteArr.length; i++) {
			System.out.println(byteArr[i]);
		}
	}
}