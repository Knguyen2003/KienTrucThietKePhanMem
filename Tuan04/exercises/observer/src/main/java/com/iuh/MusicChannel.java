package com.iuh;

import java.util.List;

public class MusicChannel {
    private int id;

    private String name;

    private boolean state;

    List<Subcriber> subcribers;

    public MusicChannel(int id, List<Subcriber> subcribers, boolean state, String name) {
        this.id = id;
        this.subcribers = subcribers;
        this.state = state;
        this.name = name;
    }


    //thay doi trang thai
    public void changState(){
        state = !state;
        System.out.println("state: "+ state);
        for (Subcriber sub : subcribers){
            notification(sub);
        }
    }

    //them nguoi dang ky
    public void addSubcreber(Subcriber sub){
        subcribers.add(sub);
    }


    // thong báo
    private void notification(Subcriber subcriber){
        subcriber.receiverNotification("THÔNG BÁO TỚI");
    }
}
