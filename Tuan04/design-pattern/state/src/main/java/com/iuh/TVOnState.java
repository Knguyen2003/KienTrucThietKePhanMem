package com.iuh;

public class TVOnState implements State{
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}
