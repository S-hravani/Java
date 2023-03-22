package com.zensar.model;
import java.util.Scanner;

public class ArrayMax
{
    public static void main(String[] args) {
        int arr[] = new int[7];
        int max = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }

        System.out.println("Maximum element is = "+max);

    }
}
