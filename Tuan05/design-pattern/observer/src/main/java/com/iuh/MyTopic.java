package com.iuh;

import java.util.ArrayList;
import java.util.List;

//Đóng vai trò như một Subject
public class MyTopic implements Subject {
    private final List<Observer> observers;  //Danh sách các Observer đăng ký với Topic (đang theo dõi)
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();  //Để đảm bảo rằng không có hai Thread nào cùng thao tác với Topic cùng một lúc


    public MyTopic() {
        this.observers = new ArrayList<>();
    }


    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if (!observers.contains(obj)) observers.add(obj);  //K thêm trùng
        }
    }


    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null; //Tạo một bản sao của danh sách Observer để tránh lỗi ConcurrentModificationException
      synchronized (MUTEX) {
            if (!changed)  //changed = false thì k cần thông báo
                return;
            observersLocal = new ArrayList<>(this.observers);  //Copy danh sách Observer
            this.changed = false;
      }
        for (Observer obj : observersLocal) {
            obj.update(this.message);
        }
    }

    public void postMessage (String msg){
        System.out.println("Message Posted to Topic:" + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();  //gưi tin nhan tụ dong cho tung nguoi dang ky
    }
}
