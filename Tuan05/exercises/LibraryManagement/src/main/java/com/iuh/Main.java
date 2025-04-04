package com.iuh;

import com.iuh.entity.Book;
import com.iuh.entity.Library;
import com.iuh.factory.BookFactory;
import com.iuh.observer.User;
import com.iuh.strategy.AuthorStrategy;
import com.iuh.strategy.TitleStrategy;

public class Main {
    public static void main(String[] args) {

        Library library = Library.getInstance();

       Book b1 = BookFactory.createBook("paper", false, "Kinh dị", "Tác giả 1", "Tiêu đề 1");
       Book b2 = BookFactory.createBook("ebook", false, "Kinh dị", "Tác giả 2", "Tiêu đề 2");
       Book b3 = BookFactory.createBook("audiobook", false, "Kinh dị", "Tác giả 3", "Tiêu đề 3");


        User user1 = new User("Nguyen Van A");
        User user2 = new User("Nguyen Van B");
        User user3 = new User("Nguyen Van C");


        library.register(user1);
        library.register(user2);
        library.register(user3);

        System.out.println("Tiến hành thêm sách mới!");
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);


        //Tìm
        System.out.println("Tìm kiếm sách theo tiêu đề:");
        library.searchBooks(new TitleStrategy(), "Tiêu đề 1");
        System.out.println("Tìm kiếm sách theo tác giả:");
        library.searchBooks(new AuthorStrategy(), "Tác giả 2");


        //Mượn
        System.out.println("Mượn sách:");
        library.borrowBook("Tiêu đề 1", true, false);
        library.borrowBook("Tiêu đề 1", false, true);




    }
}