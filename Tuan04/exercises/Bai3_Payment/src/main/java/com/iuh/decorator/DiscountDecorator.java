package com.iuh.decorator;

import com.iuh.PaymentStrategy;

public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(PaymentStrategy decoratedPayment) {
        super(decoratedPayment);
    }

    @Override
    public void pay(int amount) {
        int discount = 10;  // Fixed discount
        System.out.println("Applying discount: " + discount);
        super.pay(amount - discount);
    }
}
