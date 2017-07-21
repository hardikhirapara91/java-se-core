package com.hardik.javase;

/**
 * Types of Java Variables
 * 
 * There are three types of variable in java, first is local variable, second is
 * instance variable and third is static variable.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class JavaVariableTypes {

	int rlno = 123;
	static String city = "Mumbai";

	public void printLocalVariable() {

		String name = "Hardik Hirapara";

		System.out.println("Local Variable: " + name);
		System.out.println("Instance Variable: " + this.rlno);
	}

	public static void printStaticVariable() {
		System.out.println("Static Variable: " + city);
	}

	public static void main(String[] args) {

		new JavaVariableTypes().printLocalVariable();
		JavaVariableTypes.printStaticVariable();
	}
}
