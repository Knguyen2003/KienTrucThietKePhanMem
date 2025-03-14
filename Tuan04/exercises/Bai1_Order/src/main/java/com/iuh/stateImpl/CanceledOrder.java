package com.iuh.stateImpl;

import com.iuh.state.State;

public class CanceledOrder implements State {

    @Override
    public void doAction() {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}
