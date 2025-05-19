package com.nt;

public class RideSharingAppMainClass {
   public static void main(String[] args) {
	  Driver d1=new Driver("Amit", "2728292929", "amit@driver.com","KA01AB1234",4.5);
	  d1.displayDriverInfo();
	  System.out.println();
	  
	  Rider r1=new Rider();
	  r1.setName("Priya");
	  r1.setPhoneNumber("478393394");
	  r1.setEmail("priya@rider.com");
	  r1.setPaymentMethod("Credit Card");
	  r1.setRideType("Luxury");
	  r1.displayRiderInfo();
	  System.out.println();
	  
	  Driver d2=new Driver();
	  d2.setName("");
	  d2.setPhoneNumber(null);
	  d2.setEmail("driver@test.com");
	  d2.setVehicleNumber("MH12XY1234");
	  d2.setRating(6.0);
	  d2.displayDriverInfo();
	  System.out.println();
	  
	  Rider r2=new Rider("Rohit","739930322","rohit@rider.com","UPI","Standard");
	  r2.setRideType("Premium");
	  r2.displayRiderInfo();
   }
}