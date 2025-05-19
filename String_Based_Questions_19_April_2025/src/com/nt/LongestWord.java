/*Q10. Longest Word in a Sentence
       Input a sentence and display the longest word along with its length.*/
package com.nt;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        String[] words = sentence.split(" "); // Split the sentence into words
        
        String longestWord = "";
        int maxLength = 0;

        // Loop through each word and check its length
        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + maxLength);
    }
}
