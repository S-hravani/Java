package com.zensar.model;

enum Color1{Red,Green,Orange}

public class EnumSwitchDemo {
    public static void main(String[] args) {
        Color1 c = Color1.Orange;

        switch (c)
        {
            case Orange: System.out.println("Orange");
                          break;
            case Red : System.out.println("Red");
                        break;
            case Green : System.out.println("Green");
                         break;
            default:System.out.println("Not a color");

        }
    }
}
