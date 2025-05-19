package com.nt;

public class UserTest {
    public static void main(String[] args) {
        // User 1
        User user1 = new User();
        user1.setUserName("Alice");
        user1.setPurchaseAmount(150);
        user1.setMembershipStatus("Silver");

        user1.displayDiscount();
        Discount discount1 = Discount.getDiscount(user1);
        user1.applyDiscount(discount1);

        System.out.println();

        // User 2
        User user2 = new User();
        user2.setUserName("Bob");
        user2.setPurchaseAmount(600);
        user2.setMembershipStatus("Gold");

        user2.displayDiscount();
        Discount discount2 = Discount.getDiscount(user2);
        user2.applyDiscount(discount2);

        System.out.println();

        // User 3
        User user3 = new User();
        user3.setUserName("Charlie");
        user3.setPurchaseAmount(80);
        user3.setMembershipStatus("Regular");

        user3.displayDiscount();
        Discount discount3 = Discount.getDiscount(user3);
        user3.applyDiscount(discount3);
    }
}
