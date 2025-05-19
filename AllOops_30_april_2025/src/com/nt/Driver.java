package com.nt;

public class Driver extends UserforRide {
    private String vehicleNumber;
    private double rating;
    
	public Driver(String name, String phoneNumber, String email,String vehicleNumber,double rating) {
		super(name, phoneNumber, email);
		
		if(name==null || name.trim().isEmpty()) {
			System.out.println("Invalid name provided.");
		}
	
		if(phoneNumber==null || phoneNumber.trim().isEmpty()) {
			System.out.println("Invalid Phone Number.");
		}
		this.vehicleNumber=vehicleNumber;
		this.rating=rating;
	}
	
	public Driver() {}
	
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber=vehicleNumber;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public void setRating(double rating) {
		if(rating>=0.0 && rating<=5.0) {
			this.rating=rating;
		}
		else {
			System.out.println("Invalid rating.Must be between 0.0 and 5.0");
			this.rating = 0.0;
		}
	}
	
	public double getRating() {
		return rating;
	}
	
	
	void displayDriverInfo() {
		   System.out.println("Name: "+getName());
		   System.out.println("Phone: "+getPhoneNumber());
		   System.out.println("Email: "+getEmail());
		   System.out.println("Vehicle Number: "+getVehicleNumber());
		   System.out.println("Rating: "+getRating());
	}
}
