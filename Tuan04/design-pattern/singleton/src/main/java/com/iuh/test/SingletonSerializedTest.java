package com.iuh.test;

import com.iuh.singleton.SerializedSingleton;

import java.io.*;

//Ví dụ về việc phá vỡ singleton bằng serialization và cách để ngăn chặn nó
public class SingletonSerializedTest {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();


        //serialize
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));  //tạo một file có tên filename.ser
        out.writeObject(instanceOne);  //chuyển instanceOne thành byte code và lưu vào file filename.ser
        out.close();  //đóng file


        //deserialize
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));  //đọc file filename.ser
        SerializedSingleton instanceTwo = (SerializedSingleton)  in.readObject();  //chuyển byte code thành instance và gán vào instanceTwo


        in.close();

        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
    }
}
