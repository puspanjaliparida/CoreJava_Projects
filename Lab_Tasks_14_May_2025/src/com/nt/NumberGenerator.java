/*Question-3
 * Create a JAVA Program that demonstrates the usage of 
 * the Supplier interface to generate random numbers within a 
 * specified range.Your task is to implement a method
 * generateRandomNumber in the NumberGenerator class that 
 * generates a random integer between a given minimum and
 * maximum value(inclusive).
 * 
 * NumberGenerator class(ELC):
 * ---------------------------
 * Method name: generateRandomNumber
 * Access MOdifier: public
 * Non-Access Modifier: static
 * return type: int
 * parameters: int min,int max
 * Implement the generateRandomNumber method such that it generates and 
 * returns a random integer between the specified min
 * and max values(inclusive) by using Supplier<Integer>.
 * 
 * In the main method:
 * Prompt the User to enter the minimum and maximum values
 * for the range.Use the generateRandomNumber method to
 * generate a random number within the specified range.
 * Print the generated random number.
 * 
 * Example Output:
 * Enter the minimum value:5
 * Enter the maximum value:10
 * Random number generated:7
 * 
 * Test Case 1
 * Input:
 * Enter the minimum value:5
 * Enter the maximum value:10
 * Output:
 * Random number generated :7
 * 
 * Test Case 2
 * Input:
 * Enter the minimum value:1
 * Enter the maximum value:100
 * Output:
 * Random number generated:42
 * 
 * Test Case 3
 * Input:
 * Enter the minimum value:10
 * Enter the maximum value:2
 * Output:
 * Random number generated:7
 * */
package com.nt;

public class NumberGenerator {
	public static int generateRandomNumber(int max,int min) {
		return min;
		
	}
   public static void main(String[] args) {
	
   }
}

