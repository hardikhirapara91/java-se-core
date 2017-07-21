package com.hardik.javase;

/**
 * Class A
 * 
 * @author HARDIK HIRAPARA
 *
 */
class A {
	public void show() {
		System.out.println("Class A");
	}
}

/**
 * B Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class B extends A {
	@Override
	public void show() {
		System.out.println("Class B");
	}
}

/**
 * B Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class C extends B {
	@Override
	public void show() {
		System.out.println("Class C");
	}
}

/**
 * Dynamic Method Dispatch
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Demo1 {

	public static void main(String[] args) {

		A a1 = new A(); // Object of a type A
		B b1 = new B(); // Object of a type B
		C c1 = new C(); // Object of a type C

		a1.show();
		b1.show();
		c1.show();

		System.out.println("---------------------------");

		A r; // Obtain reference of type A

		r = a1;
		r.show();

		r = b1;
		r.show();

		r = c1;
		r.show();
	}
}
