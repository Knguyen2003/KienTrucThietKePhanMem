package com.iuh.test;

import com.iuh.entity.Computer;
import com.iuh.entity.PCFactory;
import com.iuh.entity.ServerFactory;
import com.iuh.factory.ComputerFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}
