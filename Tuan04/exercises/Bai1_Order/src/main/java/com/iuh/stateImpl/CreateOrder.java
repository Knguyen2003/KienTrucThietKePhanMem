package com.iuh.stateImpl;

import com.iuh.state.State;

public class CreateOrder implements State {


    @Override
    public void doAction() {
        System.out.println("Kiểm tra thông tin đơn hàng.");
    }
}
