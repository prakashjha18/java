import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class absperm {

    // Complete the absolutePermutation function below.
    static int[] absolutePermutation(int n, int k) {
        int[] res = new int[n];
        int temp = k;
        if(k==0){
            for(int i=0;i<n;i++){
                res[i] = i+1;
            }
        }
        else if((n % (2*k)) == 0){
            for(int i = 1; i <= n; i++){
                res[i-1] = i + temp ;
                if(i % k == 0){
                    temp = temp * -1;
                }
            }        
        }else{
            int[] res2 = new int[1];
            res2[0] = -1;
            return res2;
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] result = absolutePermutation(n, k);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
