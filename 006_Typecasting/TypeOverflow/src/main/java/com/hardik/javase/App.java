package com.hardik.javase;

/**
 * Java type casting overflow example
 * 
 * author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {

		int i = 130;
		byte b = (byte) i;

		System.out.println(b);
	}
}
