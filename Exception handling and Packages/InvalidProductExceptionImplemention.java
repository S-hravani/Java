package com.zensar.model;

import java.util.Scanner;

public class InvalidProductExceptionImplemention {
    public static void main(String[] args) {

        int weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the wait of your product.");
        weight = sc.nextInt();
        try
        {
            if(weight<100)
                throw new InvalidProductException("Product is invalid");
            else
                System.out.println("Valid Product");
        }
        catch (InvalidProductException e)
        {
            e.printStackTrace();
        }
    }
}