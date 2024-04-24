package com.alex.store.controller;

import com.alex.store.business.BookService;
import com.alex.store.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private BookService bookService;

    @GetMapping("book")
    public ResponseEntity<List<Book>> getBookList() {
        return new ResponseEntity<>(bookService.getBookList(), HttpStatus.OK);
    }
}
