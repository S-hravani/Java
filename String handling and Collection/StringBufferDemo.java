package com.zensar.model;

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("Hello");
        System.out.println(s1);
        System.out.println(s1.hashCode());
        s1.append( "World");
        System.out.println(s1);
        System.out.println(s1.hashCode());
    }
}
