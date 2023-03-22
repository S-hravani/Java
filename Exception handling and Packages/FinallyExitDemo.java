package com.zensar.model;

public class FinallyExitDemo {

    public static void myDemo()
    {
        try{
            System.exit(0);
        }
        finally {
            System.out.println("Inside Finally Demo");
        }
    }

    public static void main(String[] args) {
        FinallyExitDemo.myDemo();
    }
}
