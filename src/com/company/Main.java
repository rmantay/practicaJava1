package com.company;
import classes.*;
import java.lang.reflect.Array;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        if (args.length > 1){
            int len = Integer.parseInt(args[1]);
            HashMap<Integer, Boolean> nums = new HashMap<Integer, Boolean>();
            for (int i=1; i <= len; i++){
                nums.put(i, true);
            }
            sieve.getPrimes(nums);
        }

        if (args.length > 0) {
            printer.print(args[0]);
        } else {
            printer.print("no params");
        }
    }
}
