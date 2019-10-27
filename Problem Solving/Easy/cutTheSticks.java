import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class cutTheSticks.java {

    // Complete the cutTheSticks function below.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
      int  numberOfSticks = n;
        
        while(numberOfSticks>0){
            
            System.out.println(numberOfSticks);
            
            int minPositive = 1000;
            
            for(int i = 0 ;i<n;i++){
                
                if(arr[i]<minPositive && arr[i]>0){
                    minPositive = arr[i];
                }
            }
            for(int i = 0;i<n;i++){
                arr[i] = arr[i] - minPositive;
                if(arr[i]==0){
                    numberOfSticks--;
                }
            }
        }
    }
}
