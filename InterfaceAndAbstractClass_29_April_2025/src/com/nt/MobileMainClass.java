package com.nt;

public class MobileMainClass {
   public static void main(String[] args) {
	  ISIMCard jio=new Jio("7001112233");
	  ISIMCard airtel=new Airtel("128829191");
	  ISIMCard bsnl=new BSNL("788939931");
	  
	  MobilePhone mp=new MobilePhone();
	  mp.insertingSIMCards(jio);
	  mp.makingCalls("6738828222");
	  mp.sendMessage("6738828222","Hello");
	  mp.removingSIMCards();
	  System.out.println();
	  
	  MobilePhone mp1=new MobilePhone();
	  mp.insertingSIMCards(airtel);
	  mp.makingCalls("6738828222");
	  mp.sendMessage("6738828222","Hello");
	  mp.removingSIMCards();
	  System.out.println();
	  
	  MobilePhone mp2=new MobilePhone();
	  mp.insertingSIMCards(bsnl);
	  mp.makingCalls("6738828222");
	  mp.sendMessage("6738828222","Hello");
	  mp.removingSIMCards();
	  System.out.println();
   }
}