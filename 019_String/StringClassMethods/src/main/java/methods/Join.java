package methods;

/**
 * Java String join() Method
 * 
 * The java string join() method returns a string joined with given delimiter.
 * In string join method, delimiter is copied for each elements.
 * 
 * In case of null element, "null" is added.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Join {
	public static void main(String[] args) {

		String joinStr1 = String.join(" ", "Welcome", "to", "India.");
		String joinStr2 = String.join("-", new String[] {"One","Two","Three"});
		
		System.out.println(joinStr1);
		System.out.println(joinStr2);

	}
}