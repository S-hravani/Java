package com.zensar.model;

import java.util.Scanner;

public class StringArray2 {
    public static void main(String[] args) {

        String arr[][] = new String[3][3];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j] = sc.next();
            }
        }


        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
