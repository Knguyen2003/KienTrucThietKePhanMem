package com.iuh.decorator;


import com.iuh.PaymentStrategy;

//Decorator
public class PaymentDecorator implements PaymentStrategy {
    protected PaymentStrategy decoratedPayment;

    public PaymentDecorator(PaymentStrategy decoratedPayment) {
        this.decoratedPayment = decoratedPayment;
    }

    @Override
    public void pay(int amount) {
        decoratedPayment.pay(amount);
    }
}
