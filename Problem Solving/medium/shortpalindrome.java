import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class shortpalindrome {
    static int mod = 1000*1000*1000 + 7;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int[] arr1 = new int[26];
        int[][] arr2 = new int[26][26];
        int[] arr3 = new int[26];
        int ans = 0;
        for (int i = 0; i < s.length();i++){
            //System.out.println("for i="+i);
            int index = (int)(s.charAt(i)-'a');
            ans += (arr3[index]%mod);
            //System.out.print(ans+" ");
            ans = ans%mod;
            System.out.print(ans+" ");
            for (int j = 0; j < 26; j++){
                arr3[j] += (arr2[j][index]%mod);
                arr3[j] = arr3[j]%mod;
            }
            for (int j = 0; j < 26;j++){
                arr2[j][index] += (arr1[j]%mod);
                arr2[j][index] =  arr2[j][index]%mod;
            }
            arr1[index]++;
            //System.out.print(arr1[index]+" ");
            arr1[index] = arr1[index]%mod;
            //System.out.print(arr1[index]+" ");
        }
        System.out.println(ans);
    }
}
