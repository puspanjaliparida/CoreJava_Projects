package com.nt;

public class TestClassForCircle {
  public static void main(String[] args) {
	  Cylinder c=new Cylinder(5, 5);
	  System.out.println("Volume is "+c.getVolume());
	  Circle ci=new Circle(5);
	  System.out.println("Area is "+ci.getArea());
  }
}
