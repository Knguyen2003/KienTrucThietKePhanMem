package com.iuh;


//Class Adapter
public class SocketClassAdapterImpl  extends Socket implements SocketAdapter{

    @Override
    public Volt get120Volt() {
        return getVolt();
    }
    @Override
    public Volt get12Volt() {
        Volt v= getVolt();
        return convertVolt(v,10);   // 120V / 10 = 12V
    }
    @Override
    public Volt get3Volt() {
        Volt v= getVolt();
        return convertVolt(v,40); // 120V / 40 = 3V
    }


    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
/*
Kế thừa từ Socket: Giúp bạn tái sử dụng phương thức getVolt() mà không cần tạo thêm đối tượng Socket.
Triển khai SocketAdapter: Đảm bảo lớp này cung cấp đúng giao diện yêu cầu, dễ dàng thay đổi hoặc thêm mức điện áp mới.
 */