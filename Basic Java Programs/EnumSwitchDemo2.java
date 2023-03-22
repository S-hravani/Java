package com.zensar.model;
import java.util.Scanner;

enum Car{BMW,Fortuner,Creta,Ferrari}

public class EnumSwitchDemo2 {
    public static void main(String[] args) {
        Car c1 = Car.BMW;
        System.out.println(c1);


        String model;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car name = ");
        model = sc.nextLine();


        switch(model)
        {
            case "BMW ": System.out.println("BMW");
                       break;
            case "Fortuner" : System.out.println("Fortuner");
                       break;
            case "Creta" : System.out.println("Creta");
                          break;
            case "Ferrari" : System.out.println("Ferrari");
                          break;
            default:System.out.println("Enter a valid car name");
        }
    }

}
