package com.zensar.model;
import java.util.Scanner;

public class AgeExceptionImplementation {
    public static void main(String[] args) {

    int age;
    System.out.println("enter the age = ");
    Scanner sc = new Scanner(System.in);
    age = sc.nextInt();
    try
    {
        if(age<20)
            throw new TooYoungException("Please wait for some more years");
        else if (age>70)
            throw new TooOldException("Sorry you are too old");
        else
            System.out.println("Thanks for registration");
    }
    catch(TooYoungException e)
    {
        e.printStackTrace();
    }
    catch (TooOldException e)
    {
        e.printStackTrace();
    }

}
}