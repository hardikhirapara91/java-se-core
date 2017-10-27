package com.hardik.javase;

/**
 * Java Default Constructor and Parameterized Constructor
 * 
 * Default constructor provides the default values to the object like 0, null
 * etc. Parameterized constructor is used to provide different values to the
 * distinct objects.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ConstructorOverloading {

	public int i;
	public String str;

	public ConstructorOverloading() {
		System.out.println("Default Constuctor.");
	}

	public ConstructorOverloading(int a) {
		System.out.println("Paramerized Constuctor: " + a);
	}

	public ConstructorOverloading(int i, String str) {
		this.i = i;
		this.str = str;
	}

	public void printInstanceVariable() {
		System.out.println("Default Value: " + i + " : " + str);
	}

	public static void main(String[] args) {

		new ConstructorOverloading();
		new ConstructorOverloading(100);
		new ConstructorOverloading().printInstanceVariable();
		new ConstructorOverloading(100, "Hello World").printInstanceVariable();
	}

}
