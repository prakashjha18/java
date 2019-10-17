import java.util.Scanner;

public class anagram {
static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) return false;
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        int sum=0;
        for(int i=0;i<a.length();i++){
           sum=sum+(int)a.charAt(i)-(int)b.charAt(i); 
        }
    if(sum==0){
        return true;
    }
    else {
        return false;
    }
        
}
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagramss" : "Not Anagrams" );
    }
}
