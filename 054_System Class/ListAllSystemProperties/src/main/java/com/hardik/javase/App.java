package com.hardik.javase;

import java.util.Properties;

/**
 * Get all system properties in java
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class App {

	/**
	 * App Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Properties properties = System.getProperties();
		properties.list(System.out);
	}

}
