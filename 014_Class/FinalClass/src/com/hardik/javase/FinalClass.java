package com.hardik.javase;

/**
 * Final Class ABC
 * 
 * @author HARDIK HIRAPARA
 *
 */
final class ABC {
	/**
	 * Show method
	 */
	public void show() {
		System.out.println("Show method from ABC Class");
	}
}

/**
 * Class FinalClass (Final class can't inherited)
 * 
 * Exception: The type FinalClass can not subclass the final class ABC
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class FinalClass extends ABC {

	public static void main(String[] args) {
		System.out.println("Main method.");
	}
}
