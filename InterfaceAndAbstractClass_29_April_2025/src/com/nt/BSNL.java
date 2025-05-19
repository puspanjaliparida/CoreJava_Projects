package com.nt;

public class BSNL implements ISIMCard {

	private String phoneNumber;

    public BSNL(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getNetworkProvider() {
        return "BSNL";
    }

    @Override
    public void activate() {
        System.out.println("BSNL SIM activated.");
    }

    @Override
    public void deactivate() {
        System.out.println("BSNL SIM deactivated.");
    }
}
