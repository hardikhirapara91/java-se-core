package methods;

/**
 * Java String split() Method
 * 
 * The java string split() method splits this string against given regular
 * expression and returns a string array.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Split {
	public static void main(String[] args) {

		String s1 = "java string split method.";
		String[] words = s1.split("\\s");

		for (String w : words) {
			System.out.println(w);
		}

		String s2 = "welcome to split world";
		
		System.out.println("returning words:");
		for (String w : s2.split("\\s", 0)) {
			System.out.println(w);
		}

		System.out.println("returning words:");
		for (String w : s2.split("\\s", 1)) {
			System.out.println(w);
		}

		System.out.println("returning words:");
		for (String w : s2.split("\\s", 2)) {
			System.out.println(w);
		}
	}
}