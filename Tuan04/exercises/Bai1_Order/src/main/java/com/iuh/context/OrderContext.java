package com.iuh.context;

import com.iuh.state.State;

public class OrderContext implements State {
    private State state;


    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    @Override
    public void doAction() {
       if (state != null) {
           state.doAction();
       }else {
           System.out.println("State is null");
       }
    }
}
