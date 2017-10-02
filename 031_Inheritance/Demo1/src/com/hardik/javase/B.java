package com.hardik.javase;

/**
 * Class B
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class B extends A {

	int k;

	public B(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}

	public void showIJK() {
		System.out.println(i + " : " + j + " : " + k);
	}

	public void sum() {
		System.out.println("Sum: " + (i + j + k));
	}
}
