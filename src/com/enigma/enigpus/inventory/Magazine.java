package com.enigma.enigpus.inventory;

public class Magazine extends Book{

    public Magazine(String code, String title, String publisher, Integer publicationYear) {
        super();
        this.code = code;
        this.title = title;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
