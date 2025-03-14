package com.iuh.stateImpl;

import com.iuh.state.State;

public class ProcessingOrder implements State {

    @Override
    public void doAction() {
        System.out.println("Đóng gói và vận chuyển.");
    }
}
