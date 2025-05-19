package com.nt;

public class DoseBooking {
	private boolean booked;
	public boolean bookDose() {
		if(isDoseBooked()) {
			throw new RuntimeException("Dose already booked");
		}
		else { 
			return true;
		}
	}
	public boolean isDoseBooked() {
		return booked;
		
	}
	public void setBooked(boolean booked) {
		this.booked=booked;
	}
}