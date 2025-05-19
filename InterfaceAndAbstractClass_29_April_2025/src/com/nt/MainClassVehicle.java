package com.nt;

public class MainClassVehicle {
    public static void main(String[] args) {
		BMW b1=new BMW();
		Enfield e1=new Enfield();
		b1.displayFeatures();
		b1.start();
		b1.stop();
		b1.accelerate();
		b1.brake();
		System.out.println();
		
		e1.displayFeatures();
		e1.start();
		e1.stop();
		e1.accelerate();
		e1.brake();
	}
}