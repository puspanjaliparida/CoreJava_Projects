package com.nt;

public class Airtel implements ISIMCard {

	private String phoneNumber;

    public Airtel(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getNetworkProvider() {
        return "Airtel";
    }

    @Override
    public void activate() {
        System.out.println("Airtel SIM activated.");
    }

    @Override
    public void deactivate() {
        System.out.println("Airtel SIM deactivated.");
    }

}
