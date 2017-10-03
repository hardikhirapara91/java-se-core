package com.hardik.javase;

/**
 * Animal Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class ClassA {
	/**
	 * This is static method on Class A
	 */
	public static void printStatic() {
		System.out.println("ClassA.printStatic() method.");
	}

	/**
	 * This method can override
	 */
	public void printDynamic() {
		System.out.println("ClassA.printDynamic() method.");
	}
}

/**
 * Dog Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class ClassB extends ClassA {
	/**
	 * This is static method on class B
	 */
	public static void printStatic() {
		System.out.println("ClassB.printStatic() method.");
	}

	/**
	 * Overloaded method on class A
	 */
	@Override
	public void printDynamic() {
		System.out.println("ClassB.printDynamic() method.");
	}
}

/**
 * Java Runtime Polymorphism with Multilevel Class
 * 
 * @author HARDIK HIRAPARA
 */
public class App {

	public static void main(String[] args) {

		// Class-A refers to Class-B
		ClassA classA = new ClassB();
		classA.printStatic();
		classA.printDynamic();

		// Class-B refers to Class-B
		ClassB classB = new ClassB();
		classB.printStatic();
		classB.printDynamic();
	}
}
