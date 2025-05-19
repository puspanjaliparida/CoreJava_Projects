/*Question.1)
-------------------------------------------------------------------
Create a PasswordGenerator class.

Inside the main method :

Define character sets [For password generation as shown below]

 String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 String lower = "abcdefghijklmnopqrstuvwxyz";
 String digits = "0123456789";
 String special = "@#$%!&*";

Combine all the character set into a single String

Define a Supplier<String> named passwordSupplier which will generate and return a Random Password (Using all character set) by using java.util.Random class.

Use this supplier to generate and print a random secure password.

Output :

Generated Password: Ab3#eT9!
*/
package com.nt;

import java.util.Random;
import java.util.function.Supplier;

public class GeneratePassword {
	public static void main(String[] args) {
		String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String special = "@#$%!&*";

    Supplier<String> generatePassword=()->{
    	StringBuilder sb=new StringBuilder();
    	Random r=new Random();
    	for(int i=1;i<=2;i++) {
    	   sb.append(upper.charAt(r.nextInt(upper.length())));
    	   sb.append(lower.charAt(r.nextInt(lower.length())));
    	   sb.append(digits.charAt(r.nextInt(digits.length())));
    	   sb.append(special.charAt(r.nextInt(special.length())));
    	}
        return sb.toString();
    	
    };
    System.out.println("Generated Password:"+generatePassword);
	}
}
