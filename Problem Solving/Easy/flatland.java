import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class flatland {

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        int max = 0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> mins = new HashMap<Integer, Integer>();
        for(int j=0;j<c.length;j++){
                hm.put(c[j],c[j]);
        }
        //System.out.println(hm.get(0));
        for(int i=0;i<n;i++){
            for(int j=0;j<c.length;j++){
                
                if(i==c[j] || (hm.containsKey(i))){
                    break;
                }
                if(mins.get(i)==null || mins.get(i)>(Math.abs(i-c[j]))){
                    
                    mins.put(i,Math.abs(i-c[j]));
                }
            }
        }
        for(int i=0;i<n;i++){
            if(mins.containsKey(i)){
                if(mins.get(i)>max){
                    max=mins.get(i);
                    
                }
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
