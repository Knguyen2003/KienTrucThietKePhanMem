package com.iuh;

import com.iuh.decorator.DiscountDecorator;
import com.iuh.decorator.ProcessingFeeDecorator;

public class PaymentSystemTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(100);
        cart.addItem(50);

        System.out.println("Total Amount: " + cart.getTotalAmount());

        // Pay with Credit Card and Processing Fee
        PaymentStrategy creditCardPayment = new CreditCardStrategy("Khoi Nguyen", "0934185866265", "123", "12/25");
        PaymentStrategy creditCardWithFee = new ProcessingFeeDecorator(creditCardPayment);
        cart.pay(creditCardWithFee);

        // Pay with PayPal and apply discount
        PaymentStrategy paypalPayment = new PaypalStrategy("nguyenphan112@gmail.com", "password");
        PaymentStrategy paypalWithDiscount = new DiscountDecorator(paypalPayment);
        cart.pay(paypalWithDiscount);
    }
}
