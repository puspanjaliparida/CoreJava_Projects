/*Q12.Find the Most Frequent Word
      Accept a sentence and print the word that appears the most number of times.
*/
package com.nt;
import java.util.Scanner;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        String[] words = sentence.split(" ");  // Split the sentence into words
        
        String mostFrequentWord = "";
        int maxCount = 0;

        // Loop through each word and count its frequency
        for (String word : words) {
            int count = 0;
            for (String temp : words) {
                if (word.equals(temp)) {
                    count++;
                }
            }
            // Update if this word has the highest frequency so far
            if (count > maxCount) {
                mostFrequentWord = word;
                maxCount = count;
            }
        }

        System.out.println("Most frequent word: " + mostFrequentWord);
        System.out.println("Frequency: " + maxCount);
    }
}
