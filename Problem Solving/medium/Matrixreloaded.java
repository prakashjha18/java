// There is a matrix designed to find "The One" and it serves as a test for the same. The matrix has the dimension NxN(where N is odd) and the goal is to reach the center in as many steps as possible. Every cell of the matrix has a height associated with it defined by . A step is defined as moving from a cell  to  such that the height of cell  is strictly less than that of  (The cells can be located anywhere in the matrix). You are initially on the first row and first column of the matrix.

// Find the maximum number of steps that you can take to reach the center of the matrix or print  if it is not possible.

// NOTE: All the cells have distinct height. i.e. No two cells have the same height.

// Input Format

// First line contains T, number of test cases, First line of each test case contains N, next N lines describe the height of each cell in the matrix. Each of the next N lines contain N space seperated integers.

// Constraints

// N is odd
// Output Format

// For each test case print the maximum number of steps that you can take or print  if it is not possible to reach the center.

// Sample Input 0

// 2
// 3
// 10 7 12
// 8 3 14
// 11 5 2
// 3
// 9 7 12
// 8 13 14
// 11 5 2
// Sample Output 0

// 4
// -1
// Explanation 0

// In the first test case, you can move through the following path -

// (1 , 1) -> (2 , 1) -> (1 , 2) -> (3 , 2) -> (2 , 2) Center

// In the second example it is not possible to reach the center as it is higher than (0, 0)
import java.io.*;
import java.util.*;

public class Matrixreloaded {
    public static int calculate(long arr[][]){
        if(arr.length<1){
            return -1;
        }
        if(arr.length==1){
            return 0;
        }
        if(arr[0][0]<arr[arr.length/2][arr.length/2])
                return -1;
        int count=0;
        for(int k=0; k<arr.length;k++)
        {            
            for(int j=0; j<arr.length;j++)
            {
                if(arr[k][j]<arr[0][0] && arr[k][j]>arr[arr.length/2][arr.length/2])
                    count++;

            }
        }
        return (count+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int size = sc.nextInt();
            long twoD[][]=new long[size][size];
            for(int k=0; k<size;k++)
            {            
                for(int j=0; j<size;j++)
                {
                    twoD[k][j]=sc.nextInt();
                }
            }
            System.out.println(calculate(twoD));
        }
    }
}
