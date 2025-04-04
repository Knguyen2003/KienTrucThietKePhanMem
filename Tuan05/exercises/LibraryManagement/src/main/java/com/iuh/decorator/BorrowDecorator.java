package com.iuh.decorator;

public class BorrowDecorator implements Borrow {
    protected Borrow borrow;

    public BorrowDecorator(Borrow borrow) {
        this.borrow = borrow;
    }

    @Override
    public void borrow() {
        this.borrow.borrow();
    }
}
