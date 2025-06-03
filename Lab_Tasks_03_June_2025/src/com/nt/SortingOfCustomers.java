/*2.Write a Program to perform sorting operation on Customer class using 
ArrayList by implementing Comparator interface 

Create a BLC class Customer
Instance variables:
customerNumber-private-Integer
customerName-private-String
customerBill-private-Double

Create a parameterized constructor to initialize
 the instance variable of Customer class.

Implement Comparator interface to write the logic
 to sort the Customer class based on the following 
a) Based on customer number
b) Based on customer name
c) Based on customer bill
Create an ELC class which contains main method,
 create ArrayList object to hold Customer data
  as well as sort the Customer data object 
  based on the above criteria
*/
package com.nt;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collections;

class Customer{
	private Integer customerNumber;
	private String customerName;
	private Double customerBill;
	
	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber=customerNumber;
	}
	
	public Integer getCustomerNumber() {
		return customerNumber;
	}
	
	public void setcustomerName(String customerName) {
		this.customerName=customerName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerBill(Double customerBill) {
	    this.customerBill=customerBill;
	}
	
	public Double getCustomerBill() {
		return customerBill;
	}
	
	public Customer(Integer customerNumber, String customerName, Double customerBill){
		this.customerNumber=customerNumber;
		this.customerName=customerName;
		this.customerBill=customerBill;
	}

	@Override
	public String toString() {
		return "Customer Details are "+ "\n"
				+ "CustomerNumber=" + customerNumber + "\n"
				+ "CustomerName=" + customerName + "\n"
				+ "CustomerBill=" + customerBill + "\n";
	}
}
public class SortingOfCustomers {
     public static void main(String[] args) {
		List<Customer> customers=Arrays.asList(
				new Customer(101, "Lavanya", 2400.0),
				new Customer(102, "Madhusmita", 3441.0),
				new Customer(103, "Smita", 3488.0),
				new Customer(104, "Barsha", 4882.0),
				new Customer(105, "Tanushree", 2344.0)
				);
		Collections.sort(customers,(p1,p2)->p1.getCustomerNumber().compareTo(p2.getCustomerNumber()));
		System.out.println("Sorted Based on CustomerNumber:: ");
		customers.stream().forEach(System.out::println);
	
		System.out.println();
		
		Collections.sort(customers,(p1,p2)->p1.getCustomerName().compareTo(p2.getCustomerName()));
		System.out.println("Sorted Based on CustomerName:: ");
		customers.stream().forEach(System.out::println);
		
		Collections.sort(customers,(p1,p2)->p1.getCustomerBill().compareTo(p2.getCustomerBill()));
		System.out.println("Sorted Based on CustomerBill:: ");
		customers.stream().forEach(System.out::println);
	}
}
