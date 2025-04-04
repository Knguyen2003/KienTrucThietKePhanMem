package com.iuh.strategy;

import com.iuh.entity.Book;

import java.util.List;

public class AuthorStrategy implements SearchStrategy{
    @Override
    public List<Book> search(String keyword, List<Book> books) {
        return books.stream()
                .filter(book -> book.getAuthor().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }
}
