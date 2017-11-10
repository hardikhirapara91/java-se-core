package com.hardik.javase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Read input from console
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

		BufferedReader reader = null;

		try {

			reader = new BufferedReader(new InputStreamReader(System.in));

			while (true) {

				System.out.println("Enter something: ");
				String input = reader.readLine();

				if (input.equalsIgnoreCase("q")) {
					System.out.println("Exit!");
					System.exit(0);
				}

				System.out.println("input : " + input);
				System.out.println("-----------\n");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
