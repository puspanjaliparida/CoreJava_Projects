package com.nt;

public class TestClassForVehicle {
   public static void main(String[] args) {
	   Car car=new Car("Audi", "Q8", 2021, 4);
	   System.out.println("Car Details:");
	   car.displayDetails();
	   
	   Bike bike=new Bike("Yamaha", "MT-07", 2020, "SPORTS");
	   System.out.println("\nBike Details:");
	   bike.displayDetails();
   }
}
