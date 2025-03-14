package com.iuh;

public class ConsumptionTax extends TaxDecorator {


    public ConsumptionTax(Tax tax) {
        super(tax);
    }

    @Override
    public void calculateTax() {
        super.calculateTax();
        System.out.print("Thuế tiêu thụ ");
    }
}
