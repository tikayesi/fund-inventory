package com.enigma.enigpus.inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryServiceImpl implements InventoryService{
    List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void searchBook(String bookTitle) {
        for (Book book : books) {
            if(bookTitle.equals(book.getTitle())){
                System.out.println(book);
            }
        }
    }

    @Override
    public void listAllBook() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
