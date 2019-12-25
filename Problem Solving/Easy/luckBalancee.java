import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class luckBalancee {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        List<Integer> imp = new ArrayList<Integer>();
        int sum=0;
        for(int i=0;i<contests.length;i++){
            sum+=contests[i][0];
            if(contests[i][1]==1){
                imp.add(contests[i][0]);
                //System.out.print(contests[i][0]+"__");
            }
        }
        Collections.sort(imp);
        k=imp.size()-k;
        for(int i=0;i<k;i++){
            sum = sum-2*(imp.get(i));
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
