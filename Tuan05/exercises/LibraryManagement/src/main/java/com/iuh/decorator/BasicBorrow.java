package com.iuh.decorator;

import com.iuh.entity.Book;

public class BasicBorrow implements Borrow {
    private Book book;

    public BasicBorrow(Book book) {
        this.book = book;
    }
    @Override
    public void borrow() {
        System.out.println("Đã mượn sách: " + book.getTitle());
    }
}
