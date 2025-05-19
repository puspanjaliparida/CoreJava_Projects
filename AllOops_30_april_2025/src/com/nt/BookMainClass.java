package com.nt;

public class BookMainClass {
   public static void main(String[] args) {
	   Book b1=new Book("Java Programming","John Doe",500.00);
	   b1.displayBookDetails();
	   b1.calculateLateFee(5);
	   System.out.println();
	   
	   Magazine m1=new Magazine("Tech Monthly", "Jane Smith", 30.00, "Issue 5");
	   m1.displayMagazineDetails();
	   m1.calculateLateFee(3);
	   System.out.println();
	   
	   Book b2=new Book();
	   b2.setTitle("Learning Java");
	   b2.setAuthor("Alice Johnson");
	   b2.setPrice(350.00);
	   b2.displayBookDetails();
	   b2.calculateLateFee(2);
	   System.out.println();
   }
}