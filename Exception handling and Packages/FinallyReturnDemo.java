package com.zensar.model;

public class FinallyReturnDemo {

    public static int myDemo()
    {
        try{
            return 0;
        }
        finally{
            System.out.println("Inside finally Demo");
        }
    }

    public static void main(String[] args) {
        System.out.println(FinallyReturnDemo.myDemo());
    }
}
