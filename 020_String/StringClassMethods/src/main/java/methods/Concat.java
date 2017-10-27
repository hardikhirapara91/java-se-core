package methods;

/**
 * Java String concat() Method
 * 
 * The java string concat() method combines specified string at the end of this
 * string. It returns combined string. It is like appending another string.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Concat {
	public static void main(String[] args) {

		String s1 = "Java String";

		s1.concat("is immutable.");

		System.out.println(s1);

		s1 = s1.concat(" is immutable so assign it explicitly.");
		
		System.out.println(s1);

	}
}