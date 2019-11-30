import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class insertionSortt2 {

    // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] A) {
        for(int  i = 1 ; i<A.length;i++) {  
            int  tmp=A[i], j=i;
            while ( j>0 && A[j-1]>tmp ) {    
            A[j]=A[j-1];
            j--;
            }
            A[j] = tmp;
            for (int x = 0; x < A.length; x++) {
                System.out.print(A[x]+" ");
            }
            System.out.println();
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }
}
