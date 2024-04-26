package com.example.booksengine;

public class BookList {

    protected String title;
    protected String author;
    protected String language;
    protected String imageLink;
    protected double price;
    protected String buyLink;

    public BookList(String title, String author, String language, String imageLink, double price, String buyLink) {
        this.author = author;
        this.buyLink = buyLink;
        this.imageLink = imageLink;
        this.language = language;
        this.price = price;
        this.title = title;
    }

}
