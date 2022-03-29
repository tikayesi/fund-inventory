package com.enigma.enigpus.exceptionTest;

public class MainException {
    public static void main(String[] args) {
        System.out.println("Start");

        try {
            ArrayThrow arrayThrow = new ArrayThrow();
            arrayThrow.parseNumber();
            arrayThrow.fun();
            arrayThrow.printArray(9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finish");
        }
    }
}


//runtime error
//compile error

//Exception adalah suatu kondisi yang tidak normal ketika program dijalankan -> error

//Handle exception
