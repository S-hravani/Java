package com.zensar.model;
import java.util.Scanner;

public class ArrayMin
{
    public static void main(String[] args) {
        int arr[] = new int[7];
        int min = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<arr.length;i++)
        {
            if(i==0||arr[i]<min)
            {
                min= arr[i];
            }
        }

        System.out.println("Minimum element is = "+min);

    }
}

