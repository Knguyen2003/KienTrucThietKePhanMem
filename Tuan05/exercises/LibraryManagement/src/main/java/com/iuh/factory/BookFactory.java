package com.iuh.factory;

import com.iuh.entity.AudioBook;
import com.iuh.entity.Book;
import com.iuh.entity.EBook;
import com.iuh.entity.PaperBook;

public class BookFactory {
    public static Book createBook(String type, boolean isBorrowed, String genre, String author, String title) {
        switch (type.toLowerCase()) {
            case "paper":
                return new PaperBook(isBorrowed, genre, author, title);
            case "ebook":
                return new EBook(isBorrowed, genre, author, title);
            case "audiobook":
                return new AudioBook(isBorrowed, genre, author, title);
            default:
                throw new IllegalArgumentException("Unknown book type: " + type);
        }
    }
}
