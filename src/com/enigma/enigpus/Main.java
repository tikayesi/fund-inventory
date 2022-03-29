package com.enigma.enigpus;

import com.enigma.enigpus.inventory.InventoryServiceImpl;
import com.enigma.enigpus.inventory.Magazine;
import com.enigma.enigpus.inventory.Menu;
import com.enigma.enigpus.inventory.Novel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu show = new Menu();
        InventoryServiceImpl inventory = new InventoryServiceImpl();
        show.menu(inventory);

    }


}
