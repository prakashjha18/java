
import java.util.*;
class palidro
{
     public static void main(String args[])
      {
            String k="";
           Scanner sc=new Scanner(System.in);
           System.out.println("enter a string");
           String s=sc.nextLine();
           for(int i=s.length()-1;i>=0;i--)
            {
                   k=k+s.charAt(i);
            }
            if(s.equals(k))
            {
                   System.out.println(" it is pallindrome");
            }
             else
             {
                   System.out.println("it is not pallindrome"); 
             }
       }
}