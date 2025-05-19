package com.nt;

public class CakeMainClass {
   public static void main(String[] args) {
	   OrderedCake oc=new OrderedCake("Round", "Vanilla", 2);
	   oc.setPrice(800);
	   oc.setMessage("Happy BirthDay");
	   oc.showCake();
   }
}