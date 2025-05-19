package com.nt;

public class CarRentalCalculator {
    public static void main(String[] args) {
    	CarRental car=new CarRental();
    	car.setCarModel("Maruti Suzuki");
    	car.setDailyRate(4000);
    	car.setRentalDays(8);
    	
    	System.out.println("The car model is "+car.getCarModel());
    	System.err.println("The No. of Rental days are "+car.getRentalDays());
    	System.out.println("The total cost is "+car.calculateTotalCost());
    }
}

