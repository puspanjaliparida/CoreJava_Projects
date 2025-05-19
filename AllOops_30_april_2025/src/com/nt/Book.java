/*Library System (Book Management)
Scenario:
You are building a Library Management System for a small library. The system
needs to manage books and their details, including the type of books.

Single Level Inheritance is required to define general book properties in a
Book class, and a specialized subclass for a Magazine with additional features.

The system should:
 - Use encapsulation to protect book and magazine details.
 - Implement constructor overloading for creating different types of books.
 - Provide methods to display details and calculate late fees for borrowing.

Requirements:
Create a superclass Book with the following private attributes:

String title
String author
double price

In the subclass Magazine, inherit Book and add the following:
String issueNumber

Implement:

- A default constructor in Book that initializes title as "Unknown", author
  as "Unknown", and price as 0.0.
- A parameterized constructor in Book to initialize all attributes.
- A constructor chaining approach to initialize attributes in Magazine class.

Getters and setters for all attributes.

Write the following methods:

- void displayBookDetails(): Displays the book's title, author, and price.
- void calculateLateFee(int daysLate): Calculates the late fee for the book
  (late fee is $1 per day).
- void displayMagazineDetails(): Displays the magazine's title, author, price,
  and issue number.

Test Case 1: Create a Book (Parameterized Constructor)
--------------------------------------------------------
Input:
Book b1 = new Book("Java Programming", "John Doe", 500.00);
b1.displayBookDetails();
b1.calculateLateFee(5);

Expected Output:
Title: Java Programming
Author: John Doe
Price: 500.0
Late Fee for 5 days: 5.0

Test Case 2: Create a Magazine (Single Level Inheritance)
-----------------------------------------------------------
Input:
Magazine m1 = new Magazine("Tech Monthly", "Jane Smith", 30.00, "Issue 5");
m1.displayMagazineDetails();
m1.calculateLateFee(3);

Expected Output:
Title: Tech Monthly
Author: Jane Smith
Price: 30.0
Issue Number: Issue 5
Late Fee for 3 days: 3.0

Test Case 3: Default Constructor + Setters - Book
Input:
Book b2 = new Book();
b2.setTitle("Learning Java");
b2.setAuthor("Alice Johnson");
b2.setPrice(350.00);
b2.displayBookDetails();
b2.calculateLateFee(2);

Expected Output:
Title: Learning Java
Author: Alice Johnson
Price: 350.0
Late Fee for 2 days: 2.0
*/
package com.nt;

public class Book {
   private String title;
   private String author;
   private double price;
   
   public Book(String title,String author,double price) {
	   this.title=title;
	   this.author=author;
	   this.price=price;
   }
   public Book() {
	   this.title="Unknown";
	   this.author="Unknown";
	   this.price=0.0;
   }
   
   public void setTitle(String title) {
	   this.title=title;
   }
   
   public String getTitle() {
	   return title;
   }
   
   public void setAuthor(String author) {
	   this.author=author;
   }
   
   public String getAuthor() {
	   return author;
   }
   
   public void setPrice(double price) {
	   this.price=price;
   }
   
   public double getPrice() {
	   return price;
   }
   
   void displayBookDetails() {
	   System.out.println("Title: "+getTitle());
	   System.out.println("Author: "+getAuthor());
	   System.out.println("Price: "+getPrice());
   }
   
   void calculateLateFee(int daysLate) {
	   int lateFee = daysLate * 1;
	   System.out.println("Late fee for "+daysLate+"days: "+lateFee);
   }
}
