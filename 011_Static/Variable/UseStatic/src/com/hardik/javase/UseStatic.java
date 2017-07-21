package com.hardik.javase;

/**
 * Use Static
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class UseStatic {

	static int a = 100;
	static int b;

	public static void printStaticData(int x) {
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("X: " + x);
	}

	static {
		b = 200;
	}

	public static void main(String[] args) {

		printStaticData(500);
		System.out.println();
		UseStatic.printStaticData(300);

		System.out.println("Static Variable A: " + a);
		System.out.println("Static Variable B: " + UseStatic.b);
	}
}
