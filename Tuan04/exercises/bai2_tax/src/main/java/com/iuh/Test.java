package com.iuh;

public class Test {
    public static void main(String[] args) {
        Tax specialTax = new SpecialTax(new ConsumptionTax(new ValueAddedTax(new TaxBasic())));
        specialTax.calculateTax();

        System.out.println();

        Tax specialTax2 = new SpecialTax(new ValueAddedTax(new TaxBasic()));
        specialTax2.calculateTax();

    }

}
