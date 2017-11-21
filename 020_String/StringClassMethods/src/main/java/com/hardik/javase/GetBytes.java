package com.hardik.javase;

/**
 * Java String getBytes() Method
 * 
 * The java string getBytes() method returns the byte array of the string. In
 * other words, it returns sequence of bytes.
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class GetBytes {
	public static void main(String[] args) {

		String str = "JAVA-PROGRAMMING";
		byte[] byteArr = str.getBytes();

		for (int i = 0; i < byteArr.length; i++) {
			System.out.println(byteArr[i]);
		}

		// Default CHARSET
		String str2 = "I like JAVA !";
        
        byte [] test2 = str2.getBytes(Charset.defaultCharset());

        for (int j=0; j<test2.length; j++) {
            System.out.print("" + test2[j] + ",");
        }

        // String with numbers and some special characters
        String str3 = "!$0123@";

        // byte array with charset
        byte bval[] = new byte[0];

        try {
            bval = str3.getBytes("UTF8");

            // Prints the byte array
            for (int i = 0; i < bval.length; i++) {
                System.out.println(bval[i]);
            }

        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
	}
}