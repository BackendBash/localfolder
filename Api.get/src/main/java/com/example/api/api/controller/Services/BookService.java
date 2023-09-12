package com.example.api.api.controller.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.api.api.entities.Book;

@Component
public class BookService {
    private static List<Book> list = new ArrayList<>();

    static {
        list.add(new Book(122, "Sangh taughts", "Doctor", "Kavi"));
        list.add(new Book(123, "Sangh taughts", "Doctor", "Kavi"));
        list.add(new Book(124, "Sangh taughts in Todays world", "Doctor Bhai", "Kavi"));
        list.add(new Book(125, "Sangh taughts on critical situations", "Doctor ji", "Kavi"));
        list.add(new Book(126, "Sangh taughts on Castism", "Doctor sahab", "Kavi"));
    }

    public List<Book> getAllBooks() {

        return list;
    }
    // get Single book by id

    public Book getBookByid(int id) {
        Book book = null;
        book = list.stream().filter(e -> e.getId() == id).findFirst().get();
        return book;
    }
}
