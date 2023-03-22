package com.zensar.model;
//Member Inner Class Demo
public class OuterDemo {
    private int a = 10;
             class Inner
           {
               void print()
               {
                   System.out.println("value of a = "+a);
               }
           }


    public static void main(String[] args) {
        OuterDemo obj1 = new OuterDemo();
        OuterDemo.Inner obj2 = obj1.new Inner();
        obj2.print();

    }
}
