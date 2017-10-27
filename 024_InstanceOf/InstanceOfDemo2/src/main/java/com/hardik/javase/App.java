package com.hardik.javase;

/**
 * Printable Interface
 * @author HARDIK HIRAPARA
 *
 */
interface Printable {
	public void print();
}

/**
 * AAA Class
 * @author HARDIK HIRAPARA
 *
 */
class AAA implements Printable {
	/**
	 * Print Method
	 */
	@Override
	public void print() {
		System.out.println("Print method on AAA Class");
	}
}
/**
 * BBB Class
 * @author HARDIK HIRAPARA
 *
 */
class BBB implements Printable {
	/**
	 * Print Method
	 */
	@Override
	public void print() {
		System.out.println("Print method on BBB Class");
	}
}
/**
 * Call Class
 * @author HARDIK HIRAPARA
 *
 */
class Call {
	/**
	 * Invoke
	 */
	public void invoke(Printable p) {
		
		// Downcasting for AAA Class
		if (p instanceof AAA) {
			AAA a1 = (AAA) p;
			a1.print();
		}
		
		// Downcasting for BBB Class
		if (p instanceof BBB) {
			BBB b1 = (BBB) p;
			b1.print();
		}
	}
}

/**
 * Java InstanceOf Operator Example
 *
 */
public class App {
	public static void main(String[] args) {

		Printable printable = new BBB();
		Call call = new Call();
		call.invoke(printable);
		call.invoke(new AAA());
	}
}
