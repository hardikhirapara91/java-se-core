package com.hardik.javase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * File Reader Demo1
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class FileReaderDemo1 {

	public static void main(String[] args) {

		try (Reader reader = new FileReader("/tmp/111.txt")) {
			int i;
			while ((i = reader.read()) != -1) {
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
