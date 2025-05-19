package com.nt;

public class User {
    private String userName;
    private double purchaseAmount;
    private String membershipStatus;
    
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getPurchaseAmount() {
		return purchaseAmount;
	}
	public void setPurchaseAmount(double purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	public String getMembershipStatus() {
		return membershipStatus;
	}
	public void setMembershipStatus(String membershipStatus) {
		this.membershipStatus = membershipStatus;
	}
    
    public void displayDiscount() {
    	System.out.println("The User name is "+getUserName());
    	System.out.println("The purchase amount is "+getPurchaseAmount());
    }
    
    public void applyDiscount(Discount discount) {
        double discountPercentage = discount.getDiscountPercentage();
        double discountAmount = (purchaseAmount * discountPercentage) / 100;
        double finalPrice = purchaseAmount - discountAmount;

        System.out.println("Discount: " + discountPercentage + "%");
        System.out.printf("Final Price: %.2f\n", finalPrice);
    }
}


//Discount Class
class Discount{
	private double discountPercentage;

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	public static Discount getDiscount(User user) {
		Discount discount=new Discount();
		double amount = user.getPurchaseAmount();
        String status = user.getMembershipStatus();
        if (status.equalsIgnoreCase("Regular")) {
            if (amount < 100)
                discount.setDiscountPercentage(5.0);
            else if (amount <= 500)
                discount.setDiscountPercentage(10.0);
            else
                discount.setDiscountPercentage(15.0);
        } else if (status.equalsIgnoreCase("Silver")) {
            if (amount < 100)
                discount.setDiscountPercentage(10.0);
            else if (amount <= 500)
                discount.setDiscountPercentage(15.0);
            else
                discount.setDiscountPercentage(20.0);
        } else if (status.equalsIgnoreCase("Gold")) {
            if (amount < 100)
                discount.setDiscountPercentage(15.0);
            else if (amount <= 500)
                discount.setDiscountPercentage(20.0);
            else
                discount.setDiscountPercentage(25.0);
        }

        return discount;
    }
}
