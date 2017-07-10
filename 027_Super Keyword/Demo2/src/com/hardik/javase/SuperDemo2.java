package com.hardik.javase;

/**
 * Test Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Test {

	public int i, j;

	public Test(int i, int j) {
		this.i = i;
		this.j = j;
	}
}

/**
 * Example Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Example extends Test {

	public int k;

	public Example(int i, int j, int k) {
		super(i, j); // Super must be first statement.
		this.k = k;
	}

	/**
	 * Display total of all int variables
	 */
	public void total() {
		System.out.println("Total: " + (super.i + super.j + this.k));
	}
}

/**
 * Super Class Constructor Demo
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class SuperDemo2 {

	public static void main(String[] args) {
		new Example(10, 20, 30).total();
	}

}
