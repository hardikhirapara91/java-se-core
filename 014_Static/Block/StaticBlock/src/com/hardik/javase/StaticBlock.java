package com.hardik.javase;

/**
 * Static Block
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class StaticBlock {

	public static String name;

	// Static block is used to initialize static data members.
	static {
		name = "Hardik Hirapara";
		System.out.println("Static block is initialized.");
	}

	public static void main(String[] args) {

		System.out.println("Name: " + name);

	}

}
