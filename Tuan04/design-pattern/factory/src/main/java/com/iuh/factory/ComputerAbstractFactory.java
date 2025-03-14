package com.iuh.factory;

import com.iuh.entity.Computer;


//Abstract Factory Design Pattern
//  Chỉ có 1 abstract factory và nhiều factory con
public interface ComputerAbstractFactory {
    public Computer createComputer();

}
