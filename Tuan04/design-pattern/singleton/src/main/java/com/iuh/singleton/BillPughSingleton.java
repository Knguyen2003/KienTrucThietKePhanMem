package com.iuh.singleton;

public class BillPughSingleton {
    //contructor private để ngăn việc tạo instance từ bên ngoài
    private BillPughSingleton(){}

    //Bill Pugh đã đề xuất một cách khác để tạo một singleton class sử dụng một static inner helper class.
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    //phương thức static để lấy instance
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
