package com.enigma.enigpus.inventory;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void menu(InventoryServiceImpl inventory){
        System.out.println("WELCOME TO ENIGPUS INVENTORY");
        System.out.println("Pilih menu:");
        System.out.println("1. Tambahkan buku");
        System.out.println("2. Daftar buku");
        System.out.println("3. Cari buku berdasarkan judul");
        System.out.println("4. Exit");

        Integer input = scanner.nextInt();

        scanner.nextLine();
        switch (input){
            case 1:
                System.out.println("Pilih jenis buku");
                System.out.println("1. Novel");
                System.out.println("2 Majalah");
                Integer jenisBuku = scanner.nextInt();
                scanner.nextLine();
                if(jenisBuku == 1) {
                   addNovel(inventory);
                }else if(jenisBuku == 2) {
                   addMagazine(inventory);
                }
                menu(inventory);

            case 2:
                System.out.println("List semua buku:");
                inventory.listAllBook();
                menu(inventory);
            case 3:
                System.out.println("Cari buku berdasarkan judul");
                String title = scanner.nextLine();
                inventory.searchBook(title);
                menu(inventory);
            case 4:
                System.exit(0);
            default:
                System.out.println("Menu tidak ada");
                menu(inventory);
        }
    }

    public void addNovel(InventoryServiceImpl inventory){
        System.out.println("Tambahkan informasi novel");
        System.out.println("Inputkan code novel: ");
        String code = scanner.nextLine();
        System.out.println("Inputkan judul novel");
        String title = scanner.nextLine();
        System.out.println("Inputkan penerbit novel");
        String publisher = scanner.nextLine();
        System.out.println("Inputkan tahun terbit novel");
        Integer publicationYear = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Inputkan penulis buku");
        String author = scanner.nextLine();
        Novel novel = new Novel(code, title, publisher, publicationYear, author);
        inventory.addBook(novel);
    }

    public void addMagazine(InventoryServiceImpl inventory){
        System.out.println("Tambahkan informasi majalah");
        System.out.println("Inputkan code majalah: ");
        String code = scanner.nextLine();
        System.out.println("Inputkan judul majalah");
        String title = scanner.nextLine();
        System.out.println("Inputkan penerbit majalah");
        String publisher = scanner.nextLine();
        System.out.println("Inputkan tahun terbit majalah");
        Integer publicationYear = scanner.nextInt();
        scanner.nextLine();
        Magazine magazine = new Magazine(code, title, publisher, publicationYear);
        inventory.addBook(magazine);
    }
}
