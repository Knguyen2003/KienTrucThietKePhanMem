package com.iuh.entity;

import com.iuh.decorator.BasicBorrow;
import com.iuh.decorator.Borrow;
import com.iuh.decorator.ExtendBorrow;
import com.iuh.decorator.SpecialEditionBorrow;
import com.iuh.observer.Observer;
import com.iuh.observer.Subject;
import com.iuh.strategy.SearchStrategy;

import java.util.ArrayList;
import java.util.List;

public class Library implements Subject {
    private List<Book> books;
    private final Object MUTEX= new Object();
    private List<Observer> observers;

    private Library() {
        books = new ArrayList<>(); // Khởi tạo danh sách sách
        this.observers=new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if(obj == null)
            throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if(!observers.contains(obj)) observers.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers(String message) {
        List<Observer> observersLocal = null;
        synchronized (MUTEX) {
            observersLocal = new ArrayList<>(this.observers);
        }
        for (Observer obj : observersLocal) {
            obj.update(message);
        }

    }

    @Override
    public Object getUpdate(Observer obj) {
        return null;
    }

    private static class SingletonHelper{
        private static final Library INSTANCE = new Library();
    }
    public static Library getInstance(){
        return SingletonHelper.INSTANCE;
    }

    // Thêm sách vào thư viện
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Đã thêm sách: " + book.getTitle());
        notifyObservers("Đã thêm sách: " + book.getTitle());
    }

    // Danh sách sách trong thư viện
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Thư viện hiện không có sách nào.");
        } else {
            System.out.println("Danh sách sách trong thư viện:");
            for (Book book : books) {
                System.out.println("- " + book);
            }
        }
    }


    public void searchBooks(SearchStrategy searchStrategy, String keyword) {
        if (books.isEmpty()) {
            System.out.println("Thư viện hiện không có sách nào.");
        } else {
            System.out.println("Kết quả tìm kiếm:");
            List<Book> results = searchStrategy.search(keyword, books);
            if (results.isEmpty()) {
                System.out.println("Không tìm thấy sách nào.");
            } else {
                for (Book book : results) {
                    System.out.println("- " + book);
                }
            }
        }
    }


    public void borrowBook(String title, boolean extend, boolean specialEdition) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                Borrow borrow = new BasicBorrow(book);

                if (extend) {
                    borrow = new ExtendBorrow(borrow);
                }

                if (specialEdition) {
                    borrow = new SpecialEditionBorrow(borrow);
                }
                borrow.borrow();

                return;
            }
        }
        System.out.println("Không tìm thấy sách: " + title);
    }

}
