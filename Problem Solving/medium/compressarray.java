// Alpha has given you a strictly increasing sequence of integers A1,A2,…,AN. Your task is to compress this sequence.

// The compressed form of this sequence is a sequence of ranges separated by commas (characters ','). A range is either an integer or a pair of integers separated by three dots (the string "..."). When each range a...b in the compressed form is decompressed into the subsequence (a,a+1,…,b), we should obtain the (comma-separated) sequence A again.

// For each maximal contiguous subsequence (a,a+1,…,b) of A such that b≥a+2, the compressed form of A must contain the range a...b; if b≤a+1, such a sequence should not be compressed into a range. A contiguous subsequence is maximal if it cannot be extended by at least one element of A next to it. It can be proved that the compressed form of any sequence is unique (i.e. well-defined).

// Input Format

// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N. The second line contains N space-separated integers A1,A2,…,AN.

// Constraints

// 1≤T≤100 1≤N≤100 1≤Ai≤1,000 for each valid i A1

// Output Format

// For each test case, print a single line containing one string ― the compressed form of the given sequence.

// Sample Input 0

// 3
// 12
// 1 2 3 5 6 8 9 10 11 12 15 17
// 4
// 4 5 7 8
// 1
// 4
// Sample Output 0

// 1...3,5,6,8...12,15,17
// 4,5,7,8
// 4
// Explanation 0

// (1,2,3) is a contiguous subsequence with length 3, so it is replaced by the string "1...3" (5,6) is a contiguous subsequence, but only with length 2, so it is not compressed into a range (8,9,10,11,12) is a contiguous subsequence with length 5, so it is replaced by "8...12" the elements 15, 17 are unaffected

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class compressarray {
    public static void compress(int arr[]){ 
        int n=arr.length;
        int i = 0, j = 0; 
        Arrays.sort(arr); 
        while (i < n){ 
            j = i; 
            while ((j + 1 < n) && (arr[j + 1] == arr[j] + 1)){ 
                j++; 
            } 
            if (i == j){ 
                if(j==arr.length-1)
                    System.out.print( arr[i]); 
                else
                System.out.print( arr[i] + ","); 

                i++; 
            } 
            else{ 
                if(arr[j]==arr[i]+1){
                    if(j==arr.length-1){
                        System.out.print( arr[i] + "," + arr[j]); 
                    }
                    else{
                    System.out.print( arr[i] + "," + arr[j] +","); 
                    }
                    i = j + 1;
                    continue;
                }
                if(j==arr.length-1)
                   System.out.print( arr[i] + "..." + arr[j] ); 
                else
                System.out.print( arr[i] + "..." + arr[j] + ","); 
                i = j + 1; 
            } 
        } 
    } 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        //sc.nextLine();
    
        while(t-->0){
            int n=sc.nextInt();
            int []a=new int[n];
            //String s=sc.next();
            for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            }
            compress(a);
            System.out.println();
        }
    }
}
