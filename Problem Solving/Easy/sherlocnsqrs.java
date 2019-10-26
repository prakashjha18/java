//package contest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sherlocnsqrs {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
           String line = br.readLine();
           int num = Integer.parseInt(line);
           for(int i = 0; i < num; i++){
               String[] inp = br.readLine().split(" ");
               int a = Integer.parseInt(inp[0]);
               int b = Integer.parseInt(inp[1]);
               int count = 0;
               for(int j = 1; j*j <= b; j++){
                   if(j*j >= a){
                       count++;
                   }
               }
               System.out.println(count);
           }
           
        } catch(Exception e) {
            
        }
        
        
        
    }
}
