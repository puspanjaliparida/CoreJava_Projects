/*3.Create a class called Product which is accepting 
 * three components pid and pname and prices.

Write one parametrized constructor to throw
 IllegalArgumentException if pid is zero or Negative.

Create one TreeSet class which will hold the 
Custom product object.

With the help of TreeSet constructor using
Comparator interface, write the logic to sort the 
Product data on the following basis
 
1) Sort based on the pid in ascending order.
2) Sort based on the pid in descending order.
3) Sort based on the name in Alphabetical order.
4) Sort based on the name in Reverse order.*/
package com.nt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Products{
	private Integer pid;
	private String pname;
	private Double price;
	public Products(Integer pid, String pname, Double price) throws IllegalArgumentException{
		this.pid = pid;
		if(pid<=0) {
			throw new IllegalArgumentException();
		}
		this.pname = pname;
		this.price = price;
	}
	
	public Integer getPid() {
		return pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product Details are:+"
			  +"Pid=" + pid + "\n"
			  +"Pname=" + pname + "\n"
			  +"Price=" + price ;
	}
}
public class TreeSet {
    public static void main(String[] args) {
		List<Products> products=Arrays.asList(
				new Products(0, "Kajal", 1222.0),
				new Products(101, "Rings", 333.0),
				new Products(-5, "Payal", 455.0),
				new Products(102, "Ear Rings", 300.0),
				new Products(103, "NeckLace", 2200.0),
				new Products(104, "Nose Ring", 200.0),
				new Products(105, "Watch", 3444.0)
				);
		//Collections.sort(products,(p1,p2)->p1.getPid().);
	}
}
