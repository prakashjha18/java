import java.io.*;
import java.util.*;

public class matchingpatter {
    public static String Matchpattern(String str,String pattern){
        ArrayList<Character> match = new ArrayList<Character>();
        int p = 0;
        String word = str;
        for(int j = 0; j < word.length() && p < pattern.length() ; j++){
            if(word.charAt(j) == pattern.charAt(p)){
                match.add(word.charAt(j));
                p++;
            }
        }
        if(match.size() != pattern.length())
            return "false";
        
        else{
            p = 0;
            boolean flag = true;
            for(int j = 0; j < word.length(); j++){
                if(word.charAt(j) == pattern.charAt(p)){
                    p++;
                    if(p==pattern.length())
                        p--;
                    continue;
                }
                if (!Character.isLowerCase(word.charAt(j))){
                    return "false";
                }
            }
                return "true";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int words = sc.nextInt();
        String[] str = new String[words];
        for(int i=0;i<words;i++){
            str[i] = sc.next();
        }
        String pattern = sc.next();
        for(int i=0;i<words;i++){
            System.out.println(Matchpattern(str[i],pattern));
        }
        
    }
}
