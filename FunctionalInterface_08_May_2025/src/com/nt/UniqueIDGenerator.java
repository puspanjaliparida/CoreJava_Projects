/*                     SET-C
 * Ques - 1
-----------
 Unique ID Generator

Develop a Java program that generates unique IDs for users and implements the Supplier functional interface using lambda expressions. The program should generate IDs based on a combination of user-specific information and random characters.

Your program should follow these specifications:

Input:

Prompt the user to enter their first name and last name.
Processing:

Define a lambda expression to generate a unique ID for the user using the Supplier interface.
Combine the user's first name, last name, and random characters to create a unique ID.
Ensure that the generated ID is unique for each user.
Output:

Print the unique ID generated for the user.*/
package com.nt;

import java.util.function.Supplier;

class IDGenerator{
	private String firstName;
	private String lastName;
	
    public IDGenerator(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
public class UniqueIDGenerator {
	public static void main(String[] args) {
		IDGenerator id=new IDGenerator(null, null);
        Supplier<IDGenerator> supplier=()->
        	new IDGenerator("khushi","parida");
        System.out.println(id.getFirstName());
	}
}

