package com.nt;

public class Magazine extends Book {
	
   private String issueNumber;

   public Magazine(String title, String author, double price,String issueNumber) {
	super(title, author, price);
	this.issueNumber=issueNumber;
   }
  
   public void setIssueNumber(String issueNumber) {
	   this.issueNumber=issueNumber;
   }
   
   public String getIssueNumber() {
	   return issueNumber;
   }
   
   void displayMagazineDetails() {
	   System.out.println("Title: "+getTitle());
	   System.out.println("Author: "+getAuthor());
	   System.out.println("Price: "+getPrice());
	   System.out.println("Issue Number: "+getIssueNumber());
   }
   
   @Override
   void calculateLateFee(int daysLate) {
	   int lateFee = daysLate * 1;
	   System.out.println("Late fee for "+daysLate+"days: "+lateFee);
   }
}
