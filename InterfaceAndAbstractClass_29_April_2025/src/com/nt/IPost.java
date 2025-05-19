/*Q7)Social Media System:
Social Media System:
Post Interface :
Create an interface named Post with methods publish() and like().
The publish() method should print a message indicating that the post has been published.
The like() method should increment a counter for the number of likes and print a message
indicating that the post has been liked.

TextPost Class :
Implement a class named TextPost that implements the Post interface.
Include attributes such as textContent (String) and likes (int).
In the constructor, initialize the likes to 0.
Provide an implementation for the publish() method to print the text content of the post.
Provide an implementation for the like() method to increment the likes counter and print
the updated number of likes.
Include an additional method, e.g., getTextContent(), to retrieve the text content
of the post.

Testing :
Write a test program that demonstrates the functionality of your social media system.
Create instances of TextPost.
Call the like and publish method and show that the number of likes are increasing.*/
package com.nt;

public interface IPost {
   default void publish() {
	   System.out.println("The Post Has been published.");
   }
   void like();
}
