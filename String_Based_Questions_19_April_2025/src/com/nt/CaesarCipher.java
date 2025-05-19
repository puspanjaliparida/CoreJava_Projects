/*Q9. Encrypt a String (Caesar Cipher)
      Shift each character of a string by 3 positions forward in the alphabet and print
      the new string.*/
package com.nt;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        StringBuilder encrypted = new StringBuilder();

        // Loop through each character in the string
        for (char c : input.toCharArray()) {
            // Check if character is a letter
            if (Character.isLetter(c)) {
                char shiftChar = (char) (c + 3);  // Shift by 3 positions
                // Handle wrapping of letters if needed
                if ((Character.isLowerCase(c) && shiftChar > 'z') || 
                      (Character.isUpperCase(c) && shiftChar > 'Z')) {
                    shiftChar -= 26;
                }
                encrypted.append(shiftChar);
            } else {
                // If not a letter, just append the character as is
                encrypted.append(c);
            }
        }

        System.out.println("Encrypted string: " + encrypted);
    }
}
