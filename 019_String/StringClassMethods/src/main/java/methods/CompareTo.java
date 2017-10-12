package methods;

/**
 * Java String CompareTo() Method
 * 
 * The java string compareTo() method compares the given string with current
 * string lexicographically. It returns positive number, negative number or 0.
 * 
 * It compares strings on the basis of Unicode value of each character in the
 * strings.
 * 
 * If first string is lexicographically greater than second string, it returns
 * positive number (difference of character value). If first string is less than
 * second string lexicographically, it returns negative number and if first
 * string is lexicographically equal to second string, it returns 0.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class CompareTo {
	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Hello";

		System.out.println(s1.compareTo(s2));// 0 because both are equal

		// -15 because "H" is 15 times lower than "W"
		String s3 = "World";
		System.out.println(s1.compareTo(s3));

		// 2 because "h" is 2 times greater than "f"
		String s5 = "Flag";
		System.out.println(s1.compareTo(s5));

		/**
		 * Java String compareTo(): empty string
		 * 
		 * If you compare string with blank or empty string, it returns length
		 * of the string. If second string is empty, result would be positive.
		 * If first string is empty, result would be negative.
		 */
		String ss1 = "hello";
		String ss2 = "";
		String ss3 = "me";

		System.out.println(ss1.compareTo(ss2));
		System.out.println(ss2.compareTo(ss3));

	}
}