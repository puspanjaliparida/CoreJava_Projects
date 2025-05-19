package com.nt;

public class Rider extends UserforRide {
    private String paymentMethod;
    private String rideType;
    
	public Rider(String name, String phoneNumber, String email, String paymentMethod, String rideType) {
		super(name, phoneNumber, email);
		this.paymentMethod=paymentMethod;
		this.rideType=rideType;
	}
	
	public Rider() {}
	
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod=paymentMethod;
	}
	
	public String getPaymentMethod() {
		return paymentMethod;
	}
	
	public void setRideType(String rideType) {
		this.rideType=rideType;
	}
	
	public String getRideType() {
		return rideType;
	}
	
	void displayRiderInfo() {
		   System.out.println("Name: "+getName());
		   System.out.println("Phone: "+getPhoneNumber());
		   System.out.println("Email: "+getEmail());
		   System.out.println("Payment Method: "+getPaymentMethod());
		   System.out.println("Ride Type: "+getRideType());
	}
}
