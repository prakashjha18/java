// Given an array of integers as input, output the indices of two numbers in the array which add up to a specified target.

// Assume that each input would have exactly one solution and you cannot use the same element twice. If 2 different elements have the same value, they can be used.
import java.io.*;
import java.util.*;

class StringToIntegerAtoi {
    // Implement your solution by completing the below function
    public int myAtoi(String str) {
        char c[] = str.toCharArray();
        int i = 0;
        int n = c.length;
        //Remove whitespace
        while (i < n && c[i] == ' ') {
            i++;
        }
        //Handle sign
        int sign = 1;
        if(i < n && (c[i] == '+' || c[i] == '-')) {
            sign = c[i] == '+' ? 1: -1;
            i++;
        }
        //Get the number
        long num = 0;
        int d;
        while(i<n) {
            d = c[i] - '0';
            if(d < 0 || d > 9)
                break;
            num = num * 10 + d;
            if(num*sign < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            if(num*sign > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            i++;
        }
        return (int)num*sign;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        int result = new StringToIntegerAtoi().myAtoi(str);
        System.out.println(result);
    }
}
