package com.nt;

public class OrderedCake extends Cake {
   private String shape;
   private String flavour;
   private int qty;
   private float price;
   private String message;
   
   protected OrderedCake(String shape, String flavour, int qty) {
	super();
	this.shape = shape;
	this.flavour = flavour;
	this.qty = qty;
   }
   
   public OrderedCake(String shape, String flavour, int qty,String message) {
	super();
	this.shape = shape;
	this.flavour = flavour;
	this.qty = qty;
	this.message=message;
}

protected String getShape() {
	  return shape;
   }

   protected void setShape(String shape) {
	  this.shape = shape;
   }

   protected String getFlavour() {
	  return flavour;
   }

   protected void setFlavour(String flavour) {
	  this.flavour = flavour;
   }

   protected int getQty() {
	  return qty;
   }

   protected void setQty(int qty) {
	  this.qty = qty;
   }

   protected float getPrice() {
	  return price;
   }

   protected void setPrice(float price) {
	  this.price = price;
   }
   
   
   public String getMessage() {
	return message;
   }

   public void setMessage(String message) {
	this.message = message;
   }

   protected void showCake() {
	  System.out.println("A "+shape+" "+flavour+" Cake of "+qty+" Kg/Kg's ready with message "+message+" @ Rs."+price+"/-");   
   } 
}
