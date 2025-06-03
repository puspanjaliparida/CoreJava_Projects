/*1.
------------
Write a Program to perform sorting operation on Product class using ArrayList by implementing Comparable interface.

Create a BLC class Product.

Instance variables:
productNumber-private-Integer
productName-private-String
productPrice-private-Double

Create a parameterized constructor to initialize the instance variable of Product class.

Implement Comparable interface to write the logic to sort the Product class based on the Product Name.

Create an ELC class which contains main method, create ArrayList object to hold Product data as well as sort the product data object based on the product name.
*/
package com.nt;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Product{
	private Integer productNumber;
	private String productName;
	private Double productPrice;
	
	public Integer getProductNumber() {
		return productNumber;
	}
	
	public void setProductNumber(Integer productNumber) {
		this.productNumber=productNumber;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName=productName;
	}
	
	public Double getProductPrice() {
		return productPrice;
	}
	
	public void setProductPrice(Double productPrice) {
		this.productPrice=productPrice;
	}
	
	public Product(Integer productNumber,String productName,Double productPrice) {
		this.productNumber=productNumber;
		this.productName=productName;
		this.productPrice=productPrice;
	}

	@Override
	public String toString() {
		return "Product Details based on Sorted by ProductName:\n" +
		       "Product Number = " + productNumber + "\n" +
		       "Product Name = " + productName + "\n" +
		       "Product Price = " + productPrice + "\n";
	}
}
public class SortingOfProducts {
     public static void main(String[] args) {
		List<Product> products= Arrays.asList(
				new Product(123, "Foundation", 2355.0),
				new Product(124, "Lipstick", 5000.0),
				new Product(125, "Kajal", 562.0),
				new Product(126, "Eye Liner", 290.0),
				new Product(127, "Muskara", 400.0),
				new Product(128, "Blush",3000.0),
				new Product(129, "Nail Polish",500.0),
				new Product(130, "Lip Gloss",3000.0),
				new Product(131, "Primer", 3452.0),
				new Product(132, "Sun Screen", 6000.0)
				);
		
		Collections.sort(products,(p1,p2)->p1.getProductName().compareTo(p2.getProductName()));
		products.stream().forEach(System.out::println);
	}
}
