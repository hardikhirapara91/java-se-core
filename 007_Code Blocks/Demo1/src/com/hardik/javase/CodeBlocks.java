package com.hardik.javase;

/**
 * Code Blocks Example
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class CodeBlocks {

	public static void main(String[] args) {

		int x = 20;

		for (int i = 0; i < 10; i++) {

			int y = 30;

			System.out.println("i: " + i);
			System.out.println("x: " + x);
			System.out.println("y: " + y);

			x -= 2;
			y -= 3;
		}
	}
}
