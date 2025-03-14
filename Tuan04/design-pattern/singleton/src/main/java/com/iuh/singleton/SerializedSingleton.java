package com.iuh.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    //
    private static final long serialVersionUID = -7604766932017737115L;

    //contructor private để ngăn việc tạo instance từ bên ngoài
    private SerializedSingleton(){}

    //Khởi tạo instance trong class helper
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    //phương thức static để lấy instance
    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }

    //Cách khắc phuc việc tạo ra các instance khác nhau khi deserializing
    protected Object readResolve() {
        return getInstance();
    }

}
