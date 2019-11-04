import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class timeinwords {

    // Complete the timeInWords function below.
    static void timeInWords(int h, int m) {
        String nums[] = { "zero", "one", "two", "three", "four", 
                            "five", "six", "seven", "eight", "nine", 
                            "ten", "eleven", "twelve", "thirteen", 
                            "fourteen", "fifteen", "sixteen", "seventeen", 
                            "eighteen", "nineteen", "twenty", "twenty one", 
                            "twenty two", "twenty three", "twenty four", 
                            "twenty five", "twenty six", "twenty seven", 
                            "twenty eight", "twenty nine", 
                        }; 
      
        if (m == 0) 
            System.out.println(nums[h] + " o' clock "); 
      
        else if (m == 1) 
            System.out.println("one minute past " +  
                                            nums[h]); 
      
        else if (m == 59) 
            System.out.println("one minute to " +  
                            nums[(h % 12) + 1]); 
      
        else if (m == 15) 
            System.out.println("quarter past " + nums[h]); 
      
        else if (m == 30) 
            System.out.println("half past " + nums[h]); 
      
        else if (m == 45) 
            System.out.println("quarter to " +  
                                nums[(h % 12) + 1]); 
      
        else if (m <= 30) 
            System.out.println( nums[m] + " minutes past " + 
                                                    nums[h]); 
      
        else if (m > 30) 
            System.out.println( nums[60 - m] + " minutes to " +      
                                                nums[(h % 12) + 1]); 


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        timeInWords(h, m);


        scanner.close();
    }
}
