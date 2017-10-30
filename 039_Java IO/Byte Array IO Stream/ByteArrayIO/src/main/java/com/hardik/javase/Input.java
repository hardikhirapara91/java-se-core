package com.hardik.javase;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Input {
	/**
	 * App Main method
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		String writeString = "Hello World! How are you?";

		try (InputStream byteArrayIStream = new ByteArrayInputStream(writeString.getBytes())) {

			int i = 0;

			while ((i = byteArrayIStream.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
