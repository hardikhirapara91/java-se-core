package com.hardik.javase;

import com.hardik.javase.test.Foo;

/**
 * Application Main Class
 *
 * A class cannot be private or protected except nested class.
 */
public class App {
	public static void main(String[] args) {
		Foo foo = new Foo();
		System.out.println(foo.no); // no cannot be resolved or is not a field
		foo.display(); // The method display() is undefined for the type Foo
	}
}
