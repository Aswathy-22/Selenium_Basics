package com.obs.sample;

import java.util.Scanner;

public class Oddnumbercheck {
    public static void main(String[] args)
    {
        int num, a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = sc.nextInt();
        if(num%2!=0)
        {
            System.out.println("Number is Odd");
        }
        else
        {
            System.out.println("Number is even");
        }
    }
}
