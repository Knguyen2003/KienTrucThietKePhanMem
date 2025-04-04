package com.iuh.decorator;

public class SpecialEditionBorrow extends BorrowDecorator {

    public SpecialEditionBorrow(Borrow borrow) {
        super(borrow);
    }

    @Override
    public void borrow() {
        super.borrow();
        System.out.println("Đã mượn phiên bản đặc biệt.");
    }
}
