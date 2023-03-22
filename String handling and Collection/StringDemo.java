package com.zensar.model;

public class StringDemo {
    public static void main(String args[]) {
        String s1 = new String("Shravani");
        System.out.println(s1.hashCode());
        s1 = s1.concat("Panaskar");
        System.out.println(s1);
        System.out.println(s1.hashCode());
        String s3 = "      Java" ;
        String s4 = "Hello";
        System.out.println(s3.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s3.trim());
        System.out.println(s1.length());
        System.out.println(s4.substring(1,3));
        System.out.println(s4.charAt(2));


    }
}
