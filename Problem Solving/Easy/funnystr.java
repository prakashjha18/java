import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class funnystr {

    // Complete the funnyString function below.
    static String funnyString(String s) {
        boolean valid = false;
        for(int i=0;i<s.length()-1;i++){
            int j = s.length()-1-i;
            int first = Math.abs(s.charAt(i) - s.charAt(i+1));
            int last = Math.abs(s.charAt(j) - s.charAt(j-1));
            if(first == last){
                valid = true;
            }
            else{
                valid = false;
                break;
            }
        }
        if(valid == true)
            return "Funny";
        else
            return "Not Funny";
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
