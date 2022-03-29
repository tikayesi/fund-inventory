package com.enigma.enigpus.inventory;

public class Novel extends Book{
    private String author;

    public Novel(String code, String title, String publisher, Integer publicationYear, String author) {
        this.code = code;
        this.title = title;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicationYear=" + publicationYear +
                ", author='" + author + '\'' +
                '}';
    }
}
