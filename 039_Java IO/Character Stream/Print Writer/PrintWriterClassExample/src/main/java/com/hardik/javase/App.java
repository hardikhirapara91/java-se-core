package com.hardik.javase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * PrintWriter class example
 * 
 * Java PrintWriter class is the implementation of Writer class. It is used to
 * print the formatted representation of objects to the text-output stream.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class App {

	/**
	 * App Main Method
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// Data to write on Console using PrintWriter
		PrintWriter writer = new PrintWriter(System.out);
		writer.write("Hello World!");
		writer.flush();
		writer.close();

		// Data to write in File using PrintWriter
		PrintWriter writer1 = null;
		writer1 = new PrintWriter(new File("/tmp/foo.txt"));
		writer1.write("I love java programming.");
		writer1.flush();
		writer1.close();
	}
}
