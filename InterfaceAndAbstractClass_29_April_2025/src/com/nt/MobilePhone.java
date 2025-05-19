package com.nt;

public class MobilePhone implements IMobilePhone {
	private ISIMCard sim;
	
	@Override
	public void insertingSIMCards(ISIMCard sim) {
		 if (this.sim != null) {
	            System.out.println("SIM already inserted. Please remove it first.");
	        } else {
	            this.sim = sim;
	            sim.activate();
	            System.out.println("Inserted SIM from " + sim.getNetworkProvider() + " with number " + sim.getPhoneNumber());
	        }
	}

	@Override
	public void removingSIMCards() {
		if (sim != null) {
            sim.deactivate();
            System.out.println("Removed SIM from " + sim.getNetworkProvider());
            sim = null;
        } else {
            System.out.println("No SIM to remove.");
        }
	}

	@Override
	public void makingCalls(String number) {
		if (sim != null) {
            System.out.println("Calling " + number + " using " + sim.getNetworkProvider() + " SIM (" + sim.getPhoneNumber() + ")");
        } else {
            System.out.println("No SIM card inserted. Cannot make a call.");
        }
	}

	@Override
	public void sendMessage(String number,String message) {
		if (sim != null) {
            System.out.println("Sending message to " + number + " using " + sim.getNetworkProvider() + " SIM (" + sim.getPhoneNumber() + "): " + message);
        } else {
            System.out.println("No SIM card inserted. Cannot send message.");
        }
	}

}
