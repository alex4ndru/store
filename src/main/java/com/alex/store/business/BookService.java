package com.alex.store.business;

import com.alex.store.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    public List<Book> getBookList()  {
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setName("Book 1");
        b1.setPrice(100);
        Book b2 = new Book();
        b2.setName("Book 2");
        b2.setPrice(105);
        books.add(b1);
        books.add(b2);
        return books;
    }
}
