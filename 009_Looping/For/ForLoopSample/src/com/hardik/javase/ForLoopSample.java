package com.hardik.javase;

/**
 * Java For Loop
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ForLoopSample {

	public static void main(String[] args) {

		int x;

		for (x = 0; x < 10; x++) {
			System.out.println("x: " + x);
		}

		System.out.println("---------------");

		for (int i = 20; i > 0; i -= 2) {
			System.out.println("i: " + i);
		}
	}
}
