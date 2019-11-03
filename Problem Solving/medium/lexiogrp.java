import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class lexiogrp {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
        char[] arr = w.toCharArray();
        int i = arr.length - 1; 
        System.out.println(i);
        while(i>0 && arr[i-1]>=arr[i]){ 
            i--;
            System.out.println(i+"kh---"+w+"....."+"next"+arr[i]);
        }
        if(i<=0){
             return "no answer"; 
        }
    
        int j = arr.length-1; 
        while(arr[j]<= arr[i-1]){ 
            j--; 
        } 
        char temp = arr[i-1];
        arr[i-1] = arr[j];
        arr[j] = temp;
        j = arr.length - 1;
        while(i<j)
        {
            char tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
            j--;
            i++;
        }
        String ret = new String(arr);
        return ret;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
