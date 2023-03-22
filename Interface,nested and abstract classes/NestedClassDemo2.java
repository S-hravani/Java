package com.zensar.model;
//Local Inner Class Demo

public class NestedClassDemo2 {

    private int  num = 20;
    void display()
    {
        class LocalInner
        {
            void print()
            {
                System.out.println("Value of num = "+num);
            }

        }

        LocalInner li = new LocalInner();
        li.print();
    }

    public static void main(String[] args) {
        NestedClassDemo2 obj = new NestedClassDemo2();
        obj.display();
    }
}
