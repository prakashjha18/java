// One day, Beast was teaching a string compression algorithm. This algorithm finds all maximal substrings which contains only one character repeated one or more times (a substring is maximal if it we cannot add one character to its left or right without breaking this property) and replaces each such substring by the string "cK", where K is the length of the substring and c is the only character it contains. For example, "aabaaa" is compressed to "a2b1a3".

// Beast wanted to check if the students understood the algorithm, so he wrote a string S on the board and asked the students if the algorithm is effective on S, i.e. if the string created by compressing S is strictly shorter than S. Help them answer this question.

// Input Format

// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows. The first and only line of each test case contains a single string S.

// Constraints

// [1 ≤ T ≤100] [1 ≤ |S| ≤ 103] S may consist of only lowercase English letters.

// Output Format

// For each test case, print a single line containing the string "YES" if the algorithm is effective on S or "NO" if it is not.

// Sample Input 0

// 3
// bbbbbbbbbbaa
// c
// aaaaaaaaaabcdefgh
// Sample Output 0

// YES
// NO
// NO
// Explanation 0

// The compressed string of "bbbbbbbbbbaa" is "b10a2", which is shorter. The compressed string of "c" is "c1", which is not shorter than "c". The compressed string of "aaaaaaaaaabcdefgh" is "a10b1c1d1e1f1g1h1", which is not shorter than "aaaaaaaaaabcdefgh" (both strings have length 17).
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class stringcompression {
    public static String compress(String input) {
        int leg=input.length();
        StringBuilder sb = new StringBuilder();
        if(input == null || input.isEmpty()){
            return "NO";
        } else if(input.length() <= 2){
            return "NO";
        }
        char[] ch = input.toCharArray();
        int lenght = ch.length;
        int count = 1;
        for (int i = 0; i <=lenght-1; i++) {
            if(i!=lenght-1 && ch[i] == ch[i+1] ){
                count++;
            } else {
                sb.append(ch[i] + "" +count);
                count = 1;
            }
        }
        if (sb.length()<leg)
            return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        //sc.nextLine();
    
        while(t-->0){
            
            String s=sc.next();
            System.out.println(compress(s));
        }
    }
}
