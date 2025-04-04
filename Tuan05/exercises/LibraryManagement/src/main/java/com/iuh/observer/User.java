package com.iuh.observer;

public class User implements Observer{
    private String name;


    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification to " + name + ": " + message);
    }

    @Override
    public void setSubject(Subject sub) {

    }

    public String getName() {
        return name;
    }
}
