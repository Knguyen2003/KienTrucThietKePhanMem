package com.iuh.observer;

public interface Subject {
    public void register(Observer obj);
    public void unregister(Observer obj);
    public void notifyObservers(String message);
    public Object getUpdate(Observer obj);
}
