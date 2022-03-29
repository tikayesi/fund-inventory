package com.enigma.enigpus.inventory;

public interface InventoryService {
    void addBook(Book book);
    void searchBook(String bookTitle);
    void listAllBook();
}
