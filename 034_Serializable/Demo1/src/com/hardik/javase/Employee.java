package com.hardik.javase;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Employee Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private List<String> permission = new ArrayList<String>();

	public Employee(String firstName, String lastName, List<String> permission) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.permission = permission;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(getFirstName() + ", ").append(getLastName() + ", ").append(permission)
				.toString();
	}

	/**
	 * Deep Clone
	 * 
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Employee deepCopy() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(this);

		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bais);
		Employee employee = (Employee) ois.readObject();
		return employee;
	}

}
