package com.hardik.javase;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Buffered Output Stream Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class BufferedOutputStream {
	public static void main(String[] args) {
		String output = "Hello World!";
		try {
			OutputStream outputStream = new java.io.BufferedOutputStream(
					new FileOutputStream("E://Hardik//temp//abc.txt"));
			outputStream.write(output.getBytes());
			outputStream.flush();
			outputStream.close();

			System.out.println("Done.");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
