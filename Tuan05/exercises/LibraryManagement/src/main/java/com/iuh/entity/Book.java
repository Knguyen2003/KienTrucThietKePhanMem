package com.iuh.entity;

public abstract class Book {
    private String title;
    private String author;
    private String genre;
    private boolean isBorrowed;

    public Book(boolean isBorrowed, String genre, String author, String title) {
        this.isBorrowed = isBorrowed;
        this.genre = genre;
        this.author = author;
        this.title = title;
    }

    public void borrowBook() {
        this.isBorrowed = true;
    }
    public void returnBook() {
        this.isBorrowed = false;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
