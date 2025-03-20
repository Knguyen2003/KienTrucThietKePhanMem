package com.iuh;

public interface Subject {

    public void register(Observer obj);
    public void unregister(Observer obj);

    //Khi trạng thái của Subject thay đổi, phương thức này sẽ được gọi để thông báo cho tất cả các Observer cập nhật thông tin.
    public void notifyObservers();
    // Thay vì Subject tự động gửi dữ liệu khi thông báo, Observer có thể chủ động gọi phương thức này để lấy thông tin.
    public Object getUpdate(Observer obj);
}
