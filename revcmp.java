import java.io.*;
import java.util.*;

public class revcmp {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String M="";
        for(int i=A.length()-1;i>=0;i--){
            M=M+A.charAt(i);
        }
        if(A.equals(M)==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No"); 
        }
    }
}
