package com.hardik.javase;

/**
 * Java StringBuilder class example
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	/**
	 * App Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		StringBuilder content = new StringBuilder("Hello");

		System.out.println(content);

		content.append(" World!"); // append() method

		System.out.println(content);

		content.insert(5, "-"); // Now original string is changed.

		System.out.println(content);

		content.replace(6, 12, "India"); // Here 6=start index & 12=end index

		System.out.println(content);

		content.delete(6, 10); // Here 6 = beginIndex, 10=endIndex

		System.out.println(content);

		content.reverse(); // reverse() method

		System.out.println(content);

		/**
		 * The capacity() method of StringBuffer class returns the current
		 * capacity of the buffer. The default capacity of the buffer is 16. If
		 * the number of character increases from its current capacity, it
		 * increases the capacity by (oldcapacity*2)+2.
		 */
		System.out.println("Capacity: " + content.capacity());

		/**
		 * The ensureCapacity() method of StringBuffer class ensures that the
		 * given capacity is the minimum to the current capacity. If it is
		 * greater than the current capacity, it increases the capacity by
		 * (oldcapacity*2)+2.
		 */
		StringBuilder sb = new StringBuilder();

		// default capacity 16
		System.out.println("Default Capacity: " + sb.capacity());

		// Now capacity 16
		sb.append("Hello");
		System.out.println("Capacity after append Hello String: " + sb.capacity());

		// now (16*2)+2=34 i.e (oldcapacity*2)+2
		sb.append("My village name is Mavjinjava");
		System.out.println("Capacity after appending long String: " + sb.capacity());
		
		
		sb.ensureCapacity(10);// now no change
		System.out.println(sb.capacity());// now 34
		
		sb.ensureCapacity(50);// now (34*2)+2
		System.out.println(sb.capacity());// now 70
	}

}
