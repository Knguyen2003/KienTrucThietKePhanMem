package com.iuh.singleton;

public class EagerInitializedSingleton {
    // khởi tạo instance ngay khi class được load
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //contructor private để ngăn việc tạo instance từ bên ngoài
    private EagerInitializedSingleton(){}

    //phương thức static để lấy instance
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
//EagerInitializedSingleton là một singleton class với việc khởi tạo instance ngay khi class được load.
// Điều này có thể tạo ra vấn đề nếu instance của class này không được sử dụng trong ứng dụng của bạn,

