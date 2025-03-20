package com.iuh;

//Observer
public class MyTopicSubscriber implements Observer {
    private final String name;
    private Subject topic;


    public MyTopicSubscriber(String nm) {
        this.name = nm;
    }

    @Override
    public void update(String message) {
//        String msg = (String) topic.getUpdate(this);  //Hỏi lại Topic xem có thông báo mới không
//        if (msg == null) {
//            System.out.println(name + ":: No new message");
//        } else
//            System.out.println(name + ":: Consuming message::" + msg);

        if (message == null) {
            System.out.println(name + ":: No new message");
        } else {
            System.out.println(name + ":: Consuming message::" + message);
        }
    }
//    Cách cũ = "Có post mới, tự đi tìm!" 🚶
//    Cách mới = "Có post mới, đây là link!" 📩

    //Theo dõi 1 Subject nào đó
    @Override
    public void setSubject(Subject sub) {
        this.topic=sub;
    }
}
