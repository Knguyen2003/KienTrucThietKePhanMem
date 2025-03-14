package com.iuh.singleton;

public class StaticBlockSingleton {
    // khởi tạo instance trong static block
    private static StaticBlockSingleton instance;

    //contructor private để ngăn việc tạo instance từ bên ngoài
    private StaticBlockSingleton(){}


    // Khối static để khởi tạo thể hiện và xử lý ngoại lệ
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}