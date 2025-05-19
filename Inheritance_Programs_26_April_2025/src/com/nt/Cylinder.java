package com.nt;

public class Cylinder extends Circle{
    double height;
    
	public Cylinder(double radius,double height) {
		super(radius);
		if(radius<=0 && height<=0) {
			System.out.println("Error Invalid Input");
		}
		else {
			this.height=height;
		}
	}
    
	double getVolume() {
	   if(height<0) {
	      return -1;
	   }
       double volume;
       volume=3.14*radius*radius*height;
       return volume;
	}
}  

