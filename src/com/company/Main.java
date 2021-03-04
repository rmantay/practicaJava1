package com.company;
import classes.*;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        if (args.length > 0) {
            printer.print("Ingrese el numero hasta el que desee calcular los numeros primos ");
            int len = scanner.nextInt();

            HashMap<Integer, Boolean> nums = new HashMap<Integer, Boolean>();
            for (int i = 0; i <= len; i++) {
                nums.put(i, true);
            }
            sieve.getPrimes(nums);
        } else {
            printer.print("Ingrese la cantidad de numeros a mostrar ");
            int n = scanner.nextInt();
            printer.print("Ingrese la cantidad de repeticiones");
            int m= scanner.nextInt();
            printer.print("Ingrese el numero que quiere evaluar la repeticion");
            String sTextoBuscado = scanner.next();

            int start_at = -1 + (int)Math.pow(10, String.valueOf(m).length() - 1);
            int nprinted = 0;
            while (nprinted < n){
                String sTexto = String.valueOf(start_at);
                int cantidad_de_chars_matcheados = 0;
                while (sTexto.indexOf(sTextoBuscado) > -1) {
                    sTexto = sTexto.substring(sTexto.indexOf(sTextoBuscado)+sTextoBuscado.length(),sTexto.length());
                    cantidad_de_chars_matcheados++;
                }
                if (cantidad_de_chars_matcheados == m) {
                    nprinted++;
                    printer.print(String.valueOf(start_at));
                }
                start_at++;
            }

        }
    }

}
