package com.iuh;

public class ValueAddedTax extends TaxDecorator {
    public ValueAddedTax(Tax tax) {
        super(tax);
    }

    @Override
    public void calculateTax() {
        super.calculateTax();
        System.out.print("Thuế giá trị gia tăng ");
    }
}
