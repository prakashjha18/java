import java.io.*;
import java.math.*;
import java.security.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class 3dsurfaearea {

    
    static int surfaceArea(int[][] A, int H, int W) {
        int area = 2*W*H;
        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                area += Math.max(0, A[i][j]-A[i-1][j]);
                area += Math.max(0, A[i][j]-A[i+1][j]);
                area += Math.max(0, A[i][j]-A[i][j-1]);
                area += Math.max(0, A[i][j]-A[i][j+1]);
            }
        }
        return area;

    }

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int[][] A = new int[H+2][W+2];

        for (int i = 1; i <= H; i++) {
            

            for (int j = 1; j <= W; j++) {
                
                A[i][j] = scanner.nextInt();
            }
        }

        int result = surfaceArea(A,H,W);
        System.out.println(result);
        

        scanner.close();
    }
}
