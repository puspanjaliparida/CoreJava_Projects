package com.nt;

public class User {
	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking doseBooking;

	public User(String name,int age,boolean hasHealthCondition) {
		this.name=name;
		eligibility=new VaccineEligibility(age,hasHealthCondition);
		doseBooking=new DoseBooking();
	}
	public boolean isEligible() {
		return eligibility.isEligible();
		}
	public void bookDose() {
		if(isEligible()) {
			try {
				doseBooking.bookDose();
				System.out.println("Dose booked succesfully for "+name+".");
				doseBooking.setBooked(true);
				
			}catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
		else throw new RuntimeException(name+" is not eligible for the vaccine.");
	}
	public boolean isDoseBooked() {
		return doseBooking.isDoseBooked();
	}
}