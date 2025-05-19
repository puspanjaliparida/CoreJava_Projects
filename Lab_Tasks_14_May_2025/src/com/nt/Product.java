/*Based on abstract class
 * Assignment:
 * ------------
 * Develop a scenario based program by using abstract class
 * and abstract method for displaying different kinds of Products 
 * like Digital Product and Physical Product as well as discount 
 * and tax applicable on these products.
 * 
 * We need to develop one program on Hierarchical Inheritance,where Product is 
 * the super class and it has two sub classes DigitalProduct and PhysicalProduct.
 * 
 * Validate all the user inputs in constructor and where it is required.
 * 
 * Coding Requirements:
 * ---------------------
 * Create one BLC class called Product.
 * Attributes/Properties/Fields:[Access Modifier private for all the fields]
 * --------------------------------------------------------------------------
 * name:String
 * price:double
 * category:String
 * 
 * Take a parameterized constructor to initialize all the fields.
 * 
 * Methods:
 * a)Method name: applyDiscount()
 *   Argument: one argument of type double[double percentage]
 *   Return type:void
 *   Access Modifier:public and abstract
 *   
 * b)Method name: calculateTax()
 * Argument: No argument
 * Return type: double
 * Access Modifier: public and abstract
 * 
 * c)Setter and getter for price variable
 * 
 * d)Generate toString() method to print Object properties.
 * 
 *   Create another class DigitalProduct which extends from
 *   Product class.
 *   
 *   Attributes/Properties/Fields:[Access Modifier private for all the fields]
 *   -------------------------------------------------------------------------
 *   licenseKey: String
 *   Take a parameterized constructor to initialize all the fileds.
 *   
 *   Methods:
 *   a)Override applyDiscount(double percentage)method
 *   In this method find out the discount based on the given 
 *   percentage on the product price.
 *   Discount percentage is 10%.Update the new price based on the given
 *   discount.Print both Discount and Updated Price.
 *   
 *   b)Override calculateTax() method .In this method you should return 
 *   5% tax on the discounted price.
 *   
 *   c)Generate toString() to print all the fields
 *   
 *   Create another class PhysicalProduct which extends from Product class.
 *   
 *   Attributes/Properties/Fields:[Access Modifier private for all the fields]
 *   -------------------------------------------------------------------------
 *   shippingWeight: double
 *   Take a parameterized constructor to initialize all the fields.
 *   
 *   Methods:
 *   a)Override applyDisount(double percentage) method
 *   In this method find out the discount based on the given percentage on the product price.
 *   Discount percentage is 15%.
 *   Update the new price based on the given discount.
 *   Print both  Discount and Updated price.
 *   
 *   b)Override calculateTax() method .In this method you should return 8% tax
 *    on the discounted price.
 *    
 *   c)Method name: calculateShippingCost()
 *     Argument:  No argument
 *     Return type: double
 *     Access Modifier: public
 *     
 *     In this method you need to calculate and return shipping cost of the
 *     Physical Product.The defined shipping cost is 5 RS per KG.
 *  
 *   d)Generate toString() to print all the fields.
 *   Create an ELC Class called ProductStore.
 *   Inside main method display the following details as a Menu.
 *   Select Product Type:
 *   1.Digital Product
 *   2.Physical Product
 *   
 *   Write Switch case with Scanner class to Select Digital OR Physical Product
 *   
 *   Test Cases for Output:
 *   -----------------------
 *   Test Case 1:
 *   -------------
 *   Select Product Type:
 *   1.Digital Product
 *   2.Physical Product
 *   
 *   Test Case 2 :
 *   -------------
 *   Select Product Type:
 *   1.Digital Product
 *   2.Physical Product
 *   1
 *   Enter Digital Product Name: Java E Book
 *   Enter Product Price:1499.89
 *   Enter Product Category:Electronics
 *   Enter Product License Key:E_BUK_0001
 *   Digital Product:
 *   Product Name: Java E Book
 *   Category:Electronics
 *   Price:1499.89
 *   License Key:E_BUK_0001
 *   Discount applied:149.989
 *   New Price:1349.901
 *   Tax RS:67.49505
 *   
 *   Test Case 3:
 *   -------------
 *   Select Product Type:
 *   1.Digital Product
 *   2.Physical Product
 *   1
 *   Enter Physical Product Name: Laptop
 *   Enter Product Price:112000
 *   Enter Product Category:Electronics
 *   Enter Product Weight:2.9
 *   Physical Product:
 *   Product Name: Laptop
 *   Category:Electronics
 *   Price RS:112000
 *   Shipping Weight:2.9 kg
 *   Discount applied:16800.0
 *   New Price:95200.0
 *   Tax RS:7616.0
 *   Shipping Cost RS:14.5
 *   
 *   Test Cases for input validation
 *   --------------------------------
 *   Test Case 1:
 *   -------------
 *   Select Product Type:
 *   1.Digital Product
 *   2.Physical Product
 *   1
 *   Enter Digital Product Name: null
 *   Enter Product Price:12890
 *   Enter Product Category:Electronics
 *   Enter Product License Key:E_BUK_0001
 *   Product name cannot be empty or null.
 *   
 *   Test Case 2:
 *   ------------
 *   Select Product Type:
 *   1.Digital Product
 *   2.Physical Product
 *   1
 *   Enter Physical Product Name: Laptop
 *   Enter Product Price:-10000
 *   Enter Product Category:Electronics
 *   Enter Product weight:2.9
 *   Price cannot be negative.
 *   
 *   Test Case 3:
 *   -------------
 *   Select Product Type:
 *   1.Digital Product
 *   2.Physical Product
 *   1
 *   Enter Digital Product Name: E_Java_Book
 *   Enter Product Price:1567.90
 *   Enter Product Category:null
 *   Enter Product License Key:E_BUK_0001
 *   Category cannot be empty or null.
 * */
package com.nt;

public abstract class Product {
   private String name;
   private double price;
   private String category;
   
   public Product(String name, double price, String category) {
	super();
	this.name = name;
	this.price = price;
	this.category = category;
   }
   
   public abstract void applyDiscount(double percentage);
   
   public abstract double calculateTax();
   
   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
   }

   public String getCategory() {
	return category;
   }

   public void setCategory(String category) {
	this.category = category;
   }

   public double getPrice() {
	return price;
   }

   public void setPrice(double price) {
	this.price = price;
   }

   @Override
   public String toString() {
	  return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
   }  
}
