package com.zensar.model;

enum Color{RED,GREEN,BLUE;}

public class EnumDemo1 {

    public static void main(String[] args) {
        Color c1 = Color.GREEN;
        System.out.println(c1);

        for(Color s: Color.values())
        {
            System.out.println(s);
        }
    }
}
