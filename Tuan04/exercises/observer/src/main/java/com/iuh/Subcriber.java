package com.iuh;

public class Subcriber {
    private int id;
    private String name;

    public Subcriber(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void receiverNotification(String message){
        System.out.println("ID: "+id + "- Name" +name + "- Message: " +message);
    }
}
