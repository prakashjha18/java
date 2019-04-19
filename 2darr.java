import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        int max = 0,i=0,j=1,k=2,maxnew=0;
        for (i=0;i<4;i++){
            for (int m=0; m<4; m++)
            {
                max = arr[i][m] + arr[i][m+1] + arr[i][m+2]  + arr[i+1][m+1]  +arr[i+2][m] + arr[i+2][m+1] + arr[i+2][m+2];
                if(max > maxnew)
                {
                    maxnew = max;
                }

            }
            
        }
        System.out.println(maxnew);
        

    }
}
