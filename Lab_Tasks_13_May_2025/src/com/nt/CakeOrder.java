package com.nt;

public class CakeOrder {
    public static void main(String[] args) {
		Cake oc=new Cake("Round", "Vanila", 1);
		oc.setPrice(400.0);
		System.out.println(oc.toString());
		
		Cake oc1=new Cake("Round","Chocolate",4);
		oc1.setPrice(1600.0);
		System.out.println(oc1.toString());
		
		OrderedCake oc2=new OrderedCake("Square", "Pineapple", 3,"Happy Birthday ");
		oc2.setPrice(1200.0);
		System.out.println(oc2.toString());
	}
}
