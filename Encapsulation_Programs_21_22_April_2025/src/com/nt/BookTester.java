package com.nt;
class BookTester{
	public static void main(String[] args) {
		Book b1=new Book();
		b1.setTitle("Attitude is Everything");
		b1.setAuthor("Jeff Keller");
		b1.setISBN("368383");
		b1.setPrice(4678.00);
		b1.setDiscountPercentage(3.2);
		
		System.out.println("The book title is "+b1.getTitle());
		System.out.println("The author of the book is "+b1.getAuthor());
		System.out.println("The ISBN of the book is "+b1.getISBN());
		System.out.println("The Price of the book is "+b1.getPrice());
		System.out.println("The discountPercentage is "+b1.getDiscountPercentage());
		System.out.println("The final price is "+b1.getFinalPrice());
	}
}
