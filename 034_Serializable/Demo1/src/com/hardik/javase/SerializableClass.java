package com.hardik.javase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Serializable Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class SerializableClass {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		List<String> permission = new ArrayList<>();
		permission.add("ADMIN");
		permission.add("USER");

		// Create instance of serializable object
		Employee myClass = new Employee("Hardik", "Hirapara", permission);

		// Verify the content
		System.out.println(myClass);

		// Now create a deep copy of it
		Employee deepCopiedInstance = myClass.deepCopy();
		System.out.println(deepCopiedInstance);
	}
}
