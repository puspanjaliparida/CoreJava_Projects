/*Scenario:
You are developing a feature for a ride-sharing app like Uber or Lyft.
The system needs to manage information about different types of users.
Each user has a name, phone number, and email.
There are two specific user types: Driver and Rider.
A Driver has a vehicle number and rating.
A Rider has a payment method and preferred ride type.

You need to use inheritance to extend a base class, encapsulation
to protect user details, and constructor chaining for flexibility
in object creation.

Create a base class User with the following private attributes:

String name
String phoneNumber
String email

Create two subclasses:
Driver with additional attributes: String vehicleNumber, double rating
Rider with additional attributes: String paymentMethod, String rideType

Implement:
A default constructor in each class with default values using
constructor chaining.
A parameterized constructor to initialize all attributes.

Getters and setters for all fields to ensure encapsulation.
Validation in setters (e.g., name should not be empty, rating should
be in range 0.0 to 5.0).

Create the following methods:
- void displayUserInfo() in User to show name, phone, and email.
- void displayDriverInfo() in Driver to display full driver info.
- void displayRiderInfo() in Rider to display full rider info.

Test Case 1: Driver using parameterized constructor
-----------------------------------------------------
Driver d1 = new Driver("Amit", "9876543210", "amit@driver.com", "KA01AB1234", 4.5);
d1.displayDriverInfo();

Expected Output:
-----------------
Name: Amit  
Phone: 9876543210  
Email: amit@driver.com  
Vehicle Number: KA01AB1234  
Rating: 4.5  

Test Case 2: Rider using default constructor + setters
--------------------------------------------------------
Rider r1 = new Rider();
r1.setName("Priya");
r1.setPhoneNumber("9123456789");
r1.setEmail("priya@rider.com");
r1.setPaymentMethod("Credit Card");
r1.setRideType("Luxury");
r1.displayRiderInfo();

Expected Output:
----------------
Name: Priya  
Phone: 9123456789  
Email: priya@rider.com  
Payment Method: Credit Card  
Ride Type: Luxury  

Test Case 3: Invalid values in setters
----------------------------------------
Driver d2 = new Driver();
d2.setName("");
d2.setPhoneNumber(null);
d2.setEmail("driver@test.com");
d2.setVehicleNumber("MH12XY1234");
d2.setRating(6.0); // invalid
d2.displayDriverInfo();

Expected Output:
----------------
Invalid name provided.  
Invalid phone number.  
Invalid rating. Must be between 0.0 and 5.0  
Name: Unknown  
Phone: Unknown  
Email: driver@test.com  
Vehicle Number: MH12XY1234  
Rating: 0.0  

Test Case 4: Rider with partial input and update
--------------------------------------------------
Rider r2 = new Rider("Rohit", "9090909090", "rohit@rider.com", "UPI", "Standard");
r2.setRideType("Premium");
r2.displayRiderInfo();

Expected Output:
----------------
Name: Rohit  
Phone: 9090909090  
Email: rohit@rider.com  
Payment Method: UPI  
Ride Type: Premium*/
package com.nt;

public class UserforRide {
   private String name;
   private String phoneNumber;
   private String email;
   
   public UserforRide() {}
   public UserforRide(String name, String phoneNumber, String email) {
	super();
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.email = email;
   }

   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
	if(name==null || name.trim().isEmpty()) {
		System.out.println("Invalid name provided.");
		this.name="unknown";
	}
	else {
		this.name=name;
	}
   }

   public String getPhoneNumber() {
	return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
	if(phoneNumber==null || phoneNumber.trim().isEmpty()) {
		System.out.println("Invalid Phone Number.");
		this.phoneNumber="unnkown";
	}
	else {
		this.phoneNumber=phoneNumber;
	}
   }

   public String getEmail() {
	return email;
   }

   public void setEmail(String email) {
	this.email = email;
   }   
   
   void displayUserInfo() {
	   System.out.println("Name of the User::"+getName());
	   System.out.println("PhoneNumber of the User::"+getPhoneNumber());
	   System.out.println("Email of the User::"+getEmail());
   }
}
