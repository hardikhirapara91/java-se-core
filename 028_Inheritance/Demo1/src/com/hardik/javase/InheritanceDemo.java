package com.hardik.javase;

/**
 * Inheritance Demo
 * 
 * @author HARDIK HIRAPAR
 *
 */
public class InheritanceDemo {

	public static void main(String[] args) {

		A a1 = new A(11, 22);
		a1.showIJ();

		B b1 = new B(11, 22, 33);
		b1.showIJ();
		b1.showIJK();
		b1.sum();
	}

}
