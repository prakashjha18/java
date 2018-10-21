import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class excephandle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            Scanner sc = new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
        }
        catch (InputMismatchException e){

         System.out.println("java.util.InputMismatchException");

       }
       catch (Exception e){
         System.out.println(e);
       }
    }
}
