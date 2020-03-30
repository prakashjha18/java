// A lucky number is a number in which each of its digit are unique. You have two integers a and b. Find an integer x which satisfies the conditions below: a ≤ x ≤ b. Note - All digits of x are different. If there are multiple answers, print the minimum number.

// Input Format

// The first line contains two integers a and b.

// Constraints

// [1 ≤ a ≤ b ≤ 100000]

// Output Format

// If more than one answer exist, print mimimum of them. Otherwise, print −1.

// Sample Input 0

// 121 130
// Sample Output 0

// 123
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class uniqueno {
    public static int unique(int left, int right){
        for (int i=left ; i<=right; i++) 
        { 
            boolean vis[] = new boolean[10]; 
            int n = i; 
            while (n != 0) 
            { 
                if (vis[n % 10]) 
                    break; 
       
                vis[n%10] = true; 
       
                n = n/10; 
            } 
       
            if (n == 0) {
                return i; 
            }
            
        } 
        return -1;
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(unique(l, r)); 
    }
}
