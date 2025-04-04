package com.iuh.observer;

public interface Observer {
    public void update(String message);
    public void setSubject(Subject sub);
}
