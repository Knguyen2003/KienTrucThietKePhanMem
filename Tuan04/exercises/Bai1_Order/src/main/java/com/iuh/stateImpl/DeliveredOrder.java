package com.iuh.stateImpl;

import com.iuh.state.State;

public class DeliveredOrder implements State {

    @Override
    public void doAction() {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}
