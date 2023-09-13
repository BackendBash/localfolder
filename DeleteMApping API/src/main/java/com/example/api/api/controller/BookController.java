package com.example.api.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.api.controller.Services.*;
import com.example.api.api.entities.Book;

@RestController
public class BookController {
    @Autowired
    private BookService bookservice;

    @GetMapping("/books")

    public List<Book> getBooks() {

        return this.bookservice.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") int id) {

        return bookservice.getBookByid(id);

    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        Book a = this.bookservice.addBook(book);
        return a;

    }

    // Delete Book Handler
    @DeleteMapping("/books/{booksID}")
    public void deleteBook(@PathVariable("booksID") int booksID) {
        this.bookservice.deleteBook(booksID);

    }
}
