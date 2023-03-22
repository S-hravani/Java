package com.zensar.model;

import java.io.IOException;

public class ThrowsImplementation {
    public static void main(String[] args) {
        try {
            ThrowsDemo obj = new ThrowsDemo();
            //obj.myMethod(1);
            obj.myMethod(5);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
