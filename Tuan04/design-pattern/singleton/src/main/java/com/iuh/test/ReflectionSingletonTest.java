package com.iuh.test;

import com.iuh.singleton.EagerInitializedSingleton;
import com.iuh.singleton.EnumSingleton;

import java.lang.reflect.Constructor;

//Ví dụ về việc phá vỡ singleton bằng reflection và cách để ngăn chặn nó
public class ReflectionSingletonTest {
    public static void main(String[] args) {
//      EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
//      EagerInitializedSingleton instanceTwo = null;  //phá vỡ singleton

        EnumSingleton instanceOne = EnumSingleton.INSTANCE;
        EnumSingleton instanceTwo = null;

        try {
//          Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors(); //Lấy ra tất cả các constructor (bao gồm cả private)
            Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);  //cho phép truy cập vào constructor private
//              instanceTwo = (EagerInitializedSingleton) constructor.newInstance();  //tạo một instance mới bằng cách sử dụng constructor private
                instanceTwo = (EnumSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//      System.out.println(instanceOne.hashCode());
//      System.out.println(instanceTwo.hashCode());

        System.out.println("instanceOne hashCode = " + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode = " + (instanceTwo != null ? instanceTwo.hashCode() : "null"));
    }
 }
