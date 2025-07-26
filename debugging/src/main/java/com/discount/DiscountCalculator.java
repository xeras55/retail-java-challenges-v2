package com.discount;

public class DiscountCalculator {

/*    public double calculateDiscount(Customer customer, double totalAmount) {
        if (customer.getMembershipLevel() == "Gold") {
            return totalAmount * 0.2; // 20% de descuento
        }
        return totalAmount * 0.0;
    }*/

        public double calculateDiscount(Customer customer) {
        if (customer.getMembershipLevel() == "Gold") {
            return 20.0; // 20% de descuento
        }
        return 0.0;
    }
}
