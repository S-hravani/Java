package com.zensar.model;
import java.util.Scanner;


public class SwitchCaseDemo2 {
    public static void main(String args[])
    {
        System.out.println("Enter the Grade");
        Scanner sc = new Scanner(System.in);
        char Grade = sc.next().charAt(0);

        switch(Grade)
        {
            case 'A':
                      System.out.println("Excellent");
                      break;

            case 'B':
            case 'C':
                      System.out.println("Well done");
                      break;

            case 'D':
                System.out.println("Pass");
                break;

            case 'F':
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid Character");



        }
    }
}
