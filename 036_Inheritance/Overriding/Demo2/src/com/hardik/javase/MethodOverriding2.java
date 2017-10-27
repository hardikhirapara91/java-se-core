package com.hardik.javase;

/**
 * Class A
 * 
 * @author HARDIK HIRAPARA
 *
 */
class A {

	int i, j;

	public A(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public void show() {
		System.out.println("A [i=" + this.i + ", j=" + this.j + "]");
	}
}

/**
 * Class B
 * 
 * @author HARDIK HIRAPARA
 *
 */
class B extends A {

	int k;

	public B(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("B [k=" + this.k + "]");
	}
}

/**
 * Method Overriding Example
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class MethodOverriding2 {
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new B(10, 20, 30).show();
	}
}
