import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class gemstone {

    // Complete the gemstones function below.
    static int gemstones(String[] arr) {
        int n =arr.length;
        char c= 'a';
        int[] a = new int[26];
        int count =0;
        for(int i =0; i< n; i++){
            String s = arr[i];
            for(int j=0; j<s.length(); j++){
                if(a[s.charAt(j)%c] == i)
                    a[s.charAt(j)%c]++;
            }
        }
        for(int i =0; i<26 ; i++){
            if(a[i] == n) count++;
        }
        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
