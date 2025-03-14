package com.iuh.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Sử dụng synchronized để đảm bảo chỉ có một luồng có thể truy cập vào phương thức tại một thời điểm
    // Cách này làm chậm chương trình vì đồng bộ hóa mọi lần truy cập, ngay cả khi instance đã được tạo.
//    public static synchronized ThreadSafeSingleton getInstance(){
//        if(instance == null){
//            instance = new ThreadSafeSingleton();
//        }
//        return instance;
//    }

    // Sử dụng double checked locking để giảm overhead của synchronized
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}


//Thread-safe initialization tôi ưu hơn Lazy initialization
