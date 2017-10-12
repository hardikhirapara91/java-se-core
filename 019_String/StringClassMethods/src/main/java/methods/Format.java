package methods;

/**
 * Java String format() Method
 * 
 * The java string format() method returns the formatted string by given locale,
 * format and arguments.
 * 
 * If you don't specify the locale in String.format() method, it uses default
 * locale by calling Locale.getDefault() method.
 * 
 * The format() method of java language is like sprintf() function in c language
 * and printf() method of java language.
 * 
 * https://sharkysoft.com/archive/printf/docs/javadocs/lava/clib/stdio/doc-files/specification.htm
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Format {
	public static void main(String[] args) {

		String lang = "Java Programming";

		String sf1 = String.format("Language is %s", lang); // String
		String sf2 = String.format("Value is %f", 32.33434); // Float

		// Returns 12 char fractional part filling with 0
		String sf3 = String.format("Value is %30.12f", 32.33434); // Float

		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);

		// We can set number on parameters
		String sf4 = String.format("(1) %1$s\n(2) %2$s\n(3) %3$s\n(4) %4$s\n(5) %5$s\n", "One", "Two", "Three", "For",
				"Five");
		System.out.println(sf4);

		// ===============================================
		// conversion type character
		// (typechar is a single character identifying the conversion type)
		// ===============================================
		// %d - signed int (signed decimal integer)
		// %u - unsigned int (unsigned decimal integer)
		// %o - unsigned int (unsigned octal integer)
		// %x, %X - unsigned int (unsigned hexadecimal integer, lowercase or
		// uppercase)
		// %z[n], %Z[n] - unsigned int (unsigned integer base n, with n coded in
		// decimal; include square brackets)

		// %f - float (real number, standard notation)
		// %e, %E - float (real number, scientific notation (lowercase or
		// uppercase exponent marker))
		// %g, %G - float (same format as %f or %e, depending on the value.
		// Scientific notation is used only if the exponent is greater than the)

		// %s - String string
		// %c - char character
		// %p - Object object identity hash code (i.e., pointer value), in
		// unsigned hexadecimal

		// %\n - (none) platform-independent line separator (see §3)
		// %n - (null) counts characters (see §4)
	}

}
