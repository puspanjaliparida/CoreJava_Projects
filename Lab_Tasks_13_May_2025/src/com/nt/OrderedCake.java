package com.nt;

public class OrderedCake extends Cake {
	private String message;

	public OrderedCake(String shape, String flavor, int quantity) {
		super(shape, flavor, quantity);
	}
	public OrderedCake(String shape, String flavor, int quantity,String message) {
		super(shape, flavor, quantity);
		this.message=message;
	}
	
	public String toString() {
		return "A "+getShape()+" "+getFlavor()+" Cake of "+getQuantity()+"KG is Ready with "+message+"message @Rs."+getPrice();
	}
}