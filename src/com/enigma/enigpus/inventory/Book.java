package com.enigma.enigpus.inventory;

public abstract class Book {
    protected String code;
    protected  String title;
    protected  String publisher;
    protected  Integer publicationYear;

    public Book(String code, String title, String publisher, Integer publicationYear) {
        this.code = code;
        this.title = title;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }

    public Book() {

    }

    abstract public  String getTitle();
}
