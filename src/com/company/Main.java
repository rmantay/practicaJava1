package com.company;
import classes.*;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        printer.print("Ingrese el numero hasta el que desee calcular los numeros primos ");

        Scanner scanner= new Scanner(System.in);
        int len=scanner.nextInt();

        HashMap<Integer, Boolean> nums = new HashMap<Integer, Boolean>();
            for (int i=0; i <= len; i++)
            {
                nums.put(i, true);
            }
            sieve.getPrimes(nums);
    }

}
