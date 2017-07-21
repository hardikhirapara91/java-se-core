package com.hardik.javase;

/**
 * Class Test
 */
class Test {

	public void first() {
		System.out.println("First Method is Invoked.");
	}

	public void second() {
		this.first();
		System.out.println("Second Method is Invoked.");
	}

	public void third() {
		second();
		System.out.println("Third Method is Invoked.");
	}
}

/**
 * Call Method using this keyword
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ThisMethod {

	public static void main(String[] args) {

		Test t1 = new Test();
		t1.third();

	}

}
