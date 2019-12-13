import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class palindromeIndexx {

    // Complete the palindromeIndex function below.
    
    static int palindromeIndex(String s){
        int len =  s.length();
        int start = 0, end = len-1;      
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                if((s.charAt(start+1)==s.charAt(end)) && (s.charAt(start+2) == s.charAt(end-1)))
                    return start;
                else
                    return end;
            }
            start++;
            end--;
        }
        return -1;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
