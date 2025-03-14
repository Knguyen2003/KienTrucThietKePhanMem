package com.iuh.singleton;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;


    private LazyInitializedSingleton(){}


    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
//Lazy initialization là một cách để trì hoãn việc khởi tạo một đối tượng cho đến khi nó cần thiết.
// Trong trường hợp này, một đối tượng không được khởi tạo cho đến khi nó được yêu cầu lần đầu tiên.
// Điều này giúp giảm việc sử dụng bộ nhớ và tăng hiệu suất ứng dụng.
// Không an toàn cho đa luồng