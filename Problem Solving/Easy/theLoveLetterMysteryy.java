 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class theLoveLetterMysteryy {

    // Complete the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s1) {
        int i = 0  ;
        int j = s1.length() - 1 ;
        int ans = 0 ;
        while(i <= j )
        {
            int max1 = Math.max((int)s1.charAt(i),(int)s1.charAt(j)) ;
            int min1 = Math.min ((int)s1.charAt(i),(int)s1.charAt(j)) ;
            ans += (max1 - min1) ;
            i++;
            j--;
    
        }
        return ans;
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
