package classes;

import java.util.HashMap;

public class sieve {

    static public void getPrimes(HashMap<Integer, Boolean> nums ){
        int maxnum = nums.size();
        int cnum = 1;
        do {
            printer.print(String.valueOf(cnum) + " is prime");
            do {cnum++;} while (cnum < maxnum && !nums.get(cnum));
            if (cnum > maxnum) break;

            int i = cnum * 2;
            while (i < maxnum){
                nums.put(i, false);
                i += cnum;
            }

        } while (cnum < maxnum);
    }
}
