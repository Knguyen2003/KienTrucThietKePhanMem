package com.iuh;

public class SpecialTax extends TaxDecorator {
    public SpecialTax(Tax tax) {
        super(tax);
    }

    @Override
    public void calculateTax() {
        super.calculateTax();
        System.out.print("Thuế đặc biệt ");
    }
}
