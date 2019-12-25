import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Missingnumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] count = new int[10001];
        int alen = sc.nextInt();
        int arr[] = new int[alen];
        for(int i=0;i<alen;i++){
            arr[i]=sc.nextInt();
            count[arr[i]]--;
        }
        int blen = sc.nextInt();
        int brr[] = new int[blen];
        for(int i=0;i<blen;i++){
            brr[i]=sc.nextInt();
            count[brr[i]]++;
        }
        for(int i=0;i<10001;i++){
            if(count[i]>0){
                System.out.print(i+" ");
            }
        }
    }
}
