package com.hardik.javase;

/**
 * Java Break Statement Example
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
				break;
			}

			System.out.println("i = " + i);
		}
	}
}
