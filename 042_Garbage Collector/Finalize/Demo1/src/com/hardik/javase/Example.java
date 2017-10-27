package com.hardik.javase;

/**
 * Finalize Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Finalize {

	private int x;

	public Finalize(int i) {
		this.x = i;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize..." + this.x);
	}
}

/**
 * Example Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Example {

	public static void main(String[] args) {

		for (int i = 0; i < 2000000; i++) {
			new Finalize(i);
		}
	}
}
