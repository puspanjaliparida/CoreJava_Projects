package com.nt;

public class Driver implements IVehicle {

	@Override
	public void start() {
		System.out.println("Vehicle is Started.");
	}

	@Override
	public void stop() {
		System.out.println("Vehicle is Stopped.");	
	}
}
