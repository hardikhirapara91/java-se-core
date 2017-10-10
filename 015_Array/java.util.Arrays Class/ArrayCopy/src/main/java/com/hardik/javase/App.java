package com.hardik.javase;

/**
 * Java Array Copy Example
 * 
 * @author HARDIK HIRAPARA
 */
public class App {

	public static void main(String[] args) {

		char[] charArr = { 'A', 'B', 'C', 'D', 'E', 'F' }, copyArr = new char[5];

		System.arraycopy(charArr, 1, copyArr, 0, 3);
		
		for (char c : copyArr) {
			System.out.println(c);
		}

	}

}
