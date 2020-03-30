// Alpha has a string s. Each character is either 0 or 1.

// Alpha wants all 1's in the string to form a contiguous subsegment. For example, if the string is 0, 1, 00111 or 01111100, then all 1's form a contiguous subsegment, and if the string is 0101, 100001 or 11111111111101, then this condition is not met.

// Alpha may erase some (possibly none) 0's from the string. What is the minimum number of 0's that Alpha have to erase?

// Input Format

// The first line contains one integer 't ' the number of test cases.

// Then t lines follow, each representing a test case. Each line contains one string s ; each character of s is either 0 or 1.

// Constraints

// [1 ≤ t ≤ 100] [1 ≤ |s| ≤100]

// Output Format

// Print t integers, where the i-th integer is the answer to the i-th testcase (the minimum number of 0's that you have to erase from s).

// Sample Input 0

// 3
// 010011
// 0
// 1111000
// Sample Output 0

// 2
// 0
// 0

import java.io.*;
import java.util.*;

public class reploacezeros {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        //sc.nextLine();
        while(t-->0){
            String s=sc.next();
            int c,pos,pos2,i;
            c=0;
            pos=0;
            pos2=0;
            for(i=0; i<s.length(); i++)
            {
                if(s.charAt(i)=='1')
                {
                    pos=i;
                    break;
                }
            }
            for(i=s.length()-1; i>=pos; i--)
            {
                if(s.charAt(i)=='1')
                {
                    pos2=i;
                    break;
                }
            }
            for(i=pos; i<pos2; i++)
            {
                if(s.charAt(i)=='0')
                    c++;
            }
            System.out.println(c); 

        }
    }
}
