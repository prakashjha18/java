import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class magicsquare {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
       
        int[][][] pre = new int[][][]{
            {{8,1,6}, {3,5,7}, {4,9,2}},
            {{6,1,8}, {7,5,3}, {2,9,4}},
            {{4,9,2}, {3,5,7}, {8,1,6}},
            {{2,9,4}, {7,5,3}, {6,1,8}},
            {{8,3,4}, {1,5,9}, {6,7,2}},
            {{4,3,8}, {9,5,1}, {2,7,6}},
            {{6,7,2}, {1,5,9}, {8,3,4}},
            {{2,7,6}, {9,5,1}, {4,3,8}}
        };
        int diff = 0;
        int[] match = new int[8];
        int[] differ = new int[8];
        int matching = 0;
        
        for(int i=0; i<8;i++){
            for(int j=0; j<3;j++){
                for(int k=0;k<3;k++){
                    if(s[j][k] ==pre[i][j][k] )
                        match[i]++;
                    else{
                        diff = diff + Math.abs(s[j][k] - pre[i][j][k]);
                    }
                }
            }
            
            differ[i] = diff;
            diff = 0;
        }
        int max = match[0];
        int index=0;
        for(int i = 0; i < match.length; i++)
        {
            if(max < match[i])
            {
                max = match[i];
                index=i;
            }
        }
        int minimum = differ[index];
        for(int i=0;i<match.length;i++){
            if(match[i] == max){
                if(differ[i] < minimum){
                    minimum = differ[i];
                }
            }
        }
        return minimum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
