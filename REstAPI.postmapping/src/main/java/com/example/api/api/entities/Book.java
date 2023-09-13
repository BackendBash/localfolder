package com.example.api.api.entities;

public class Book {
    private int id;
    private String name;
    private String Author;
    private String publisher;

    public Book(int id, String name, String author, String publisher) {
        this.id = id;
        this.name = name;
        Author = author;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", Author=" + Author + ", publisher=" + publisher + "]";
    }

}
