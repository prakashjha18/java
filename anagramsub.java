
import java.util.Scanner;
import java.util.*;

public class anagramsub {

static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) return false;
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int [] temp = new int [6789]; 
    //sry, too lazy to calculate ASCII idx of a-z rel. i :)
        
        int summ = 0;

        for (int i = 0; i < a.length(); i++){
            summ += ++temp [a.charAt(i)] <= 0 ? -1 : 1;
            summ += --temp [b.charAt(i)] >= 0 ? -1 : 1;
        }

        return summ == 0;
}
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        String a = scan.next();
        String b = scan.next();
        scan.close();
        int x = b.length()-1;
        for(int i=0;i<(a.length()-x);i++)
        {
         
         String l = a.substring(i,i+x+1);
         boolean ret = isAnagram(l,b);
         if(ret == true)
         {
           list.add(i);
         }
         
        }
        System.out.println(list);
        
    }
}
