package com.hardik.javase;

import java.io.IOException;

/**
 * Java Singleton Class Example
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	/**
	 * App Main method
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		Account firstAccount = Account.getInstance();
		Account secondAccount = Account.getInstance();

		System.out.println(firstAccount);
		System.out.println(secondAccount);
	}

}
