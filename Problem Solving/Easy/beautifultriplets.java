import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class beautifultriplets {

    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] a) {
        int total = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[j] - a[i] == d){
                    for(int k = j+1; k < a.length; k++){
                        if(a[k] - a[j] == d){
                            total++;
                        }
                    }
                }
            }
        }
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
