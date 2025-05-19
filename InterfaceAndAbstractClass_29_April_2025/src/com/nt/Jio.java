package com.nt;

public class Jio implements ISIMCard {
	private String phoneNumber;
	
	public Jio(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String getNetworkProvider() {
		return "Jio";
	}

	@Override
    public void activate() {
        System.out.println("Jio SIM activated.");
    }

    @Override
    public void deactivate() {
        System.out.println("Jio SIM deactivated.");
    }
}
