package com.iuh;

public class SportsCar extends CarDecorator {

    public SportsCar(Car c) {
        super(c);  // super() is used to call the constructor of the parent class
    }

    @Override
    public void assemble() {
        car.assemble();  // Gọi lại phương thức assemble() của đối tượng được bọc (truyền vào lúc khởi tạo), giữ lại hành vi ban đầu.
        System.out.print(" Adding features of Sports Car.");
    }
}