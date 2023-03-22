package com.zensar.model;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
      /*  double arr[] = new double[5];
        arr[0]=15.6;
        arr[1]=45.6;
        arr[2]=69.3;
        arr[3]=62.8;
        arr[4]=96.5;*/
       double arr[] = {45.8,7.6,65.8,15.6,99.9};

        //System.out.println(Arrays.toString(arr));
      /*  for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }*/

        for(double e:arr)
        {
            System.out.print(e+" ");
        }
    }
}
