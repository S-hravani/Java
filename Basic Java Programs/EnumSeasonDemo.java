package com.zensar.model;

enum Season{Summer,Winter,Monsoon}

public class EnumSeasonDemo {
    public static void main(String[] args) {
        Season s = Season.Monsoon;
        System.out.println(s);

        System.out.println("\nUsing For each loop");

        for(Season d :Season.values())
        {
            System.out.println(d);
        }
    }
}
