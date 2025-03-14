package com.iuh;

public class Test {
    public static void main(String args[]){
          //Cách cũ
//        TVRemoteBasic remote = new TVRemoteBasic();
//        remote.setState("ON");
//        remote.doAction();
//        remote.setState("OFF");
//        remote.doAction();

        //Cách mới sử dụng State Pattern
        TVContext context = new TVContext();

        State tvOnState = new TVOnState();
        State tvOffState = new TVOffState();

        context.setState(tvOnState);
        context.doAction();

        context.setState(tvOffState);
        context.doAction();
    }
}
