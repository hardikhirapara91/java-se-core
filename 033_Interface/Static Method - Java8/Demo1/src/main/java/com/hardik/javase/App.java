package com.hardik.javase;

/**
 * Java8 Static Method Example
 * 
 * @author HARDIK HIRAPARA
 */
public class App implements Test {

	@Override
	public void print() {
		System.out.println("This is print method in App class.");
	}

	public static void main(String[] args) {
		App app = new App();
		app.print();
		
		Test.display();
	}

}
