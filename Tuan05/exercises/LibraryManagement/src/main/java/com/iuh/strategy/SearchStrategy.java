package com.iuh.strategy;

import com.iuh.entity.Book;

import java.util.List;

public interface SearchStrategy {
    public List<Book> search(String keyword, List<Book> books);
}
