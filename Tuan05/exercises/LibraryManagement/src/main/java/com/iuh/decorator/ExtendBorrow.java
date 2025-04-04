package com.iuh.decorator;

public class ExtendBorrow extends BorrowDecorator{

    public ExtendBorrow(Borrow borrow) {
        super(borrow);
    }

    @Override
    public void borrow() {
        borrow.borrow();
        System.out.println("Thời gian mượn đã được gia hạn thêm.");
    }
}
