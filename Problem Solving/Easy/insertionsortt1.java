import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class insertionsortt1 {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int last = arr[n-1];
        int i;
        for(i=n-2;i>=0;i--){
            if(arr[i]>last){
                arr[i+1] = arr[i];
            }
            else if(last> arr[i]){
                arr[i+1] = last;
            }
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
            if(i==0 && last<arr[0]){
            arr[0] = last;
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
            }
            if(last> arr[i]){
                break;
            }
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

        insertionSort1(n, arr);

        scanner.close();
    }
}
