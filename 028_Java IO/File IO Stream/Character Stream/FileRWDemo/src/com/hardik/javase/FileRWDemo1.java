package com.hardik.javase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * File Read-Write Demo1
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class FileRWDemo1 {

	public static void main(String[] args) {

		try (Reader reader = new FileReader("/tmp/111.txt"); Writer writer = new FileWriter("/tmp/222.txt")) {

			// Read 111.txt file and write it to 222.txt file.
			int i;
			while ((i = reader.read()) != -1) {
				writer.write((char) i);
				System.out.print((char) i);
			}
			System.out.println("Done!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
