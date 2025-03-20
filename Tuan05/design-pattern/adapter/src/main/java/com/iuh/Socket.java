package com.iuh;


//Lớp nguồn (adaptee)
public class Socket {


    public Volt getVolt(){
        return new Volt(120);
    }
}

//Mô phỏng một ổ cắm điện với loại điện áp 120V