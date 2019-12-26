import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class sumvsxor {
    public static void main(String [] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        scan.close();

        /* Calculate number of "x" values that will satisfy n+x = n^x */
        int zeroes = numZeroes(n);
        long result = (long) Math.pow(2, zeroes);// same as 
        System.out.println(result);
    }
    
    private static int numZeroes(long n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 0) {
                count++;
            }
            n =n/2; // divides by 2
        }
        return count;
    }
}
