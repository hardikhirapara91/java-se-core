package com.hardik.javase;

/**
 * Class A
 * 
 * @author HARDIK HIRAPARA
 *
 */
class A {
	public A() {
		System.out.println("Class A Constructor");
	}
}

/**
 * Class B
 * 
 * @author HARDIK HIRAPARA
 *
 */
class B extends A {
	public B() {
		System.out.println("Class B Constructor");
	}
}

/**
 * Calling Constructor in Inheritance
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class CallingConstructor {

	public static void main(String[] args) {
		new B();
	}
}
