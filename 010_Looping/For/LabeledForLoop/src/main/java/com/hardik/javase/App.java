package com.hardik.javase;

/**
 * Java Labeded For Loop Example
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {

		first: for (int i = 1; i <= 10; i++) {
			second: for (int j = 1; j < 10; j++) {

				System.out.println(i + " : " + j);

				if (i == 5 && j == 5)
					break first;
			}
		}

		System.out.println("After First.");
	}
}
