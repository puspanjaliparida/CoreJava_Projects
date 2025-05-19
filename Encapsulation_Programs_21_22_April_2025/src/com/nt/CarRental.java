/*Ques - 1
-------------
Car Rental Cost Calculation
You are creating a CarRental (BLC) class for a car rental service.

The class should have the following attributes:
private: carModel (String)
private: rentalDays (int) - the number of days the car is rented.
private: dailyRate (double) - the rate charged per day.
The class should calculate the total rental cost and apply a
discount based on the number of rental days:

Implement below methods:

method name: calculateTotalCost
modifiers: public
return type: double
If rentalDays are greater than 7, apply a 10% discount on the total cost.
Otherwise, no discount is applied. Return the total rental cost from
this method.

Implement public setter methods to initialize each of these attributes.
method name: setCarModel
parameter: String carModel
modifiers: public
return type: void
This method initializes the carModel attribute.

method name: setRentalDays
parameter: String rentalDays
modifiers: public
return type: void
This method initializes the rentalDays attributes.

method name: setDailyRate
parameter: String dailyRate
modifiers: public
return type: void
This method initializes the dailyRate attributes.

Implement public getter methods to retrieve the values of these
attributes.

Create a ELC class CarRentalCalculator
Write a main method to:
Create an instance of the CarRental class.
Initialize the attributes using setters.
Calculate and print the total cost using the calculateTotalCost()
method with car model and rentalDays.
*/

package com.nt;

public class CarRental {
   private String carModel;
   private int rentalDays;
   private double dailyRate;
   
   public String getCarModel() {
	  return carModel;
   }
   public void setCarModel(String carModel) {
	  this.carModel = carModel;
   }
   public int getRentalDays() {
	  return rentalDays;
   }
   public void setRentalDays(int rentalDays) {
	  this.rentalDays = rentalDays;
   }
   public double getDailyRate() {
	  return dailyRate;
   } 
   public void setDailyRate(double dailyRate) {
	  this.dailyRate = dailyRate;
   }
 
   public double calculateTotalCost() {
	   double totalRentalCost = dailyRate * rentalDays;
	   if(rentalDays>7) {
		   totalRentalCost=totalRentalCost*0.9;
	   }
	   else {
		   System.out.println("No discount is applied.");
	   }
	   return totalRentalCost;
   }
   
}
