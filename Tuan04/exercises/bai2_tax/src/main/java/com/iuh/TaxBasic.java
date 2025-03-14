package com.iuh;

public class TaxBasic implements Tax {


    @Override
    public void calculateTax() {
        System.out.print("Basic tax ");
    }
}
