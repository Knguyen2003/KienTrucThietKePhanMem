package com.iuh.factory;

import com.iuh.entity.Computer;
import com.iuh.entity.PC;
import com.iuh.entity.Server;

public class ComputerFactory {

      //Factory Design Pattern
//    public static Computer getComputer(String type, String ram, String hdd, String cpu){
//        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
//        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
//        return null;
//    }
    // Nếu bạn muốn thêm một loại máy tính mới, bạn sẽ phải thêm if-else vào hàm getComputer() trong ComputerFactory.
    // Điều này không phải là một cách tốt để thêm một loại máy tính mới.


    //Abstract Factory Design Pattern
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}

//Nếu sau này bạn muốn thêm một loại máy tính mới, bạn chỉ cần tạo một class mới kế thừa từ Computer và thêm vào hàm getComputer() trong ComputerFactory.

