import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class alternatingchars {

    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        int t = in.nextInt();

        for (int i = 1; i <= t; i++) {
            String test = in.next();
            int count=0;
            for (int j = 0; j < test.length()-1; j++) {
                if(test.charAt(j)==test.charAt(j+1))
                    count++;
            } 
            System.out.println(count);
        }
    }
}
