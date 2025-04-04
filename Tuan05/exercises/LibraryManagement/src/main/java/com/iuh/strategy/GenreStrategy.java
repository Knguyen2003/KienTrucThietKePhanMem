package com.iuh.strategy;

import com.iuh.entity.Book;

import java.util.List;

public class GenreStrategy implements SearchStrategy {

    @Override
    public List<Book> search(String keyword, List<Book> books) {
        return books.stream()
                .filter(book -> book.getGenre().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }
}
