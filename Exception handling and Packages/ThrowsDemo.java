package com.zensar.model;
import java.io.*;
public class ThrowsDemo {

    void myMethod(int num) throws IOException,ClassNotFoundException
    {
        if(num==1)
            throw new IOException("IOException Occured");
        else
            throw new ClassNotFoundException("ClassNotFoundException Occured");
    }

}
