package com.iuh;

public class ShoppingCart {
    private int totalAmount = 0;

    public void addItem(int price) {
        totalAmount += price;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(totalAmount);
    }
}
