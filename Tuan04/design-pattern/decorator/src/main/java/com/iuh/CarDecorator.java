package com.iuh;

public class CarDecorator implements Car{
    //protected dùng để cho các class con sử dụng biến car để gọi phương thức assemble() của class gốc.
    protected Car car;

    //thể hiện mối quan hệ "HAS-A" với đối tượng gốc.
    public CarDecorator(Car c){
        this.car=c;
    }

    /**
     * Phương thức assemble() sẽ được gọi từ các class con
     */
    @Override
    public void assemble(){
        this.car.assemble();
    }
}
