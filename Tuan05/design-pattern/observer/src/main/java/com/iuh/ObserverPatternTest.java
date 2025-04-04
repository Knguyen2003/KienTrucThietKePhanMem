package com.iuh;

public class ObserverPatternTest {
    public static void main(String[] args) {
        MyTopic topic = new MyTopic();
        //create observers
        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");
        Observer obj4 = new MyTopicSubscriber("Obj4");


        topic.register(obj1);  //Đăng ký theo dõi
        topic.register(obj2);
        topic.register(obj3);
        topic.register(obj4);

        obj1.setSubject(topic); //obj1 theo dõi topic
        obj2.setSubject(topic); //obj2 theo dõi topic
        obj3.setSubject(topic); //obj3 theo dõi topic
        obj4.setSubject(topic);

        topic.postMessage("Hi, I'm a new message");
        topic.postMessage("Toi vua dang bai moi");


        //Nếu k có synchronized thì kết quả sẽ khác
        // Đăng ký nhiều Observer cùng lúc
//        new Thread(() -> topic.register(obj1)).start();
//        new Thread(() -> topic.register(obj2)).start();
//        new Thread(() -> topic.register(obj3)).start();
//
//        // Gửi nhiều tin nhắn đồng thời
//        new Thread(() -> topic.postMessage("Message 1")).start();
//        new Thread(() -> topic.postMessage("Message 2")).start();
//        new Thread(() -> topic.postMessage("Message 3")).start();


    }
}