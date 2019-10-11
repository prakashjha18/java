import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class climbingleaderboard {

    static int removeDuplicates(int arr[], int n,HashMap<Integer, Integer> hash_map) 
    { 
        
        if (n == 0 || n == 1) 
            return n; 
       // To store index of next unique element 
        int j = 0; 
       // Doing same as done in Method 1 
        // Just maintaining another updated index i.e. j 
        for (int i = 0; i < n-1; i++) 
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i]; 
                hash_map.put(arr[i],j);
            }
        arr[j++] = arr[n-1]; 
       return j;  
    }

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
            int[] result = new int[alice.length];
            int n = scores.length; 
            HashMap<Integer, Integer> hash_map = new HashMap<Integer, Integer>();
            n = removeDuplicates(scores, n,hash_map); 
            for(int i=0; i<alice.length; i++){
                if(hash_map.containsKey(alice[i])){
                    result[i] = (hash_map.get(alice[i]));
                }
                else{
                    int l = 0, r = n - 1;
                    int m=0; 
                    while (l <= r) { 
                        m = l + (r -l) / 2; 
                        if (scores[m]> alice[i])
                            l = m + 1;
                        else
                            r = m -1 ;
                        }
                    result[i]=l+1;
                }
            }
            return result;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}