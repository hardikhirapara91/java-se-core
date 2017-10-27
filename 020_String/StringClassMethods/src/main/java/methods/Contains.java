package methods;

/**
 * Java String contains() Method
 * 
 * The java string contains() method searches the sequence of characters in this
 * string. It returns true if sequence of char values are found in this string
 * otherwise returns false.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Contains {
	public static void main(String[] args) {
		String name = "Java is a programming language in computer science.";
	
		System.out.println(name.contains("programming"));
		System.out.println(name.contains("age in"));
		System.out.println(name.contains("C++"));
	}
}