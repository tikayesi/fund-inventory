package com.enigma.enigpus.exceptionTest;

public class ArrayThrow{
    public void printArray(Integer idx) throws NumberFormatException{
       int [] arr = {1,2,3,4,5};
       if (idx > arr.length-1){
           throw  new ArrayIndexOutOfBoundsException("Array idx more than array index");
       }else{
           System.out.println(arr[idx]);
       }
    }

    public void parseNumber() throws NumberFormatException{
        String number = "1abc";
        Integer result = Integer.parseInt(number);
        if(result == 1){
            System.out.println(number);
        }else {
            throw new NumberFormatException("Can't format that number");
        }
    }

    public void fun() throws IllegalAccessException {
        String a = "test";
        if(a.equals("test")){
        throw new IllegalAccessException("Can't access this method");
        }else {
            System.out.println(a);
        }
    }
}
