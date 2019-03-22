# Find All Anagrams in a String

Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

```
Input:

s: "cbaebabacd" p: "abc"

Output:

[0, 6]

Explanation:

The substring with start index = 0 is "cba", which is an anagram of "abc".

The substring with start index = 6 is "bac", which is an anagram of "abc".


```

Example 2:

```

Input:

s: "abab" p: "ab"

Output:

[0, 1, 2]

Explanation:

The substring with start index = 0 is "ab", which is an anagram of "ab".

The substring with start index = 1 is "ba", which is an anagram of "ab".

The substring with start index = 2 is "ab", which is an anagram of "ab".

```

## Practice Here
https://leetcode.com/problems/find-all-anagrams-in-a-string/description/



import java.util.Scanner;
import java.util.*;

public class anagramsub {

static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) return false;
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int [] temp = new int [6789]; 
    //sry, too lazy to calculate ASCII idx of a-z rel. i :)
        
        int summ = 0;

        for (int i = 0; i < a.length(); i++){
            summ += ++temp [a.charAt(i)] <= 0 ? -1 : 1;
            summ += --temp [b.charAt(i)] >= 0 ? -1 : 1;
        }

        return summ == 0;
}
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        String a = scan.next();
        String b = scan.next();
        scan.close();
        int x = b.length()-1;
        for(int i=0;i<(a.length()-x);i++)
        {
         
         String l = a.substring(i,i+x+1);
         boolean ret = isAnagram(l,b);
         if(ret == true)
         {
           list.add(i);
         }
         
        }
        System.out.println(list);
        
    }
}
