package com.iuh;


//Bộ điều khiển trạng thái
public class TVContext implements State {
    private State tvState;

    public void setState(State state) {
        this.tvState = state;
    }

    public State getState() {
        return this.tvState;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}
//Nó không trực tiếp xử lý logic trạng thái, mà ủy quyền (delegate) cho các lớp trạng thái cụ thể (TVOnState, TVOffState).
//Điều này giúp code trở nên linh hoạt và dễ bảo trì hơn