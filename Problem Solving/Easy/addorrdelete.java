import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class addorrdelete { 
    int same = 0;

    public int findMinOperations(String s1, String s2) {
        return findMinOperationsAux(s1, s2, 0, 0);
    }

    private int findMinOperationsAux(String s1, String s2, int i1, int i2) {
        if (i1 == s1.length()) 
            return s2.length() - i2;

        if (i2 == s2.length()) 
            return s1.length() - i1;

        if (s1.charAt(i1) == s2.charAt(i2)){
            
            return findMinOperationsAux(s1, s2, i1 + 1, i2 + 1);
        }

        int c1 = 1 + findMinOperationsAux(s1, s2, i1 + 1, i2);
        
        return c1+same;
    }

    public static void main(String[] args) {
        addorrdelete editDisatnce = new addorrdelete();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int k = sc.nextInt();
        int res = editDisatnce.findMinOperations(s1,s2);
        
        if (res<= k){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
