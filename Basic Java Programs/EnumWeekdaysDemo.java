package com.zensar.model;

enum Weekdays{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;}

public class EnumWeekdaysDemo {
    public static void main(String[] args) {

        Weekdays s = Weekdays.Friday;
        System.out.println(s);

        System.out.println("\nUsing For each loop");

        for(Weekdays w:Weekdays.values())
        {
            System.out.println(w);
        }


    }
}