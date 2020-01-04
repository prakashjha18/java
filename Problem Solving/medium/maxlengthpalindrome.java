// Java implementation for counting 
// maximum length palindromes 
import java.util.*; 
  
class maxlengthpalindrome 
{ 
  
// factorial of a number 
static int fact(int n) 
{ 
    int ans = 1; 
    for (int i = 1; i <= n; i++)  
        ans = ans * i; 
    return (ans); 
} 
  
// function to count maximum length palindromes. 
static int numberOfPossiblePallindrome(String str, int n) 
{  
    // Count number of occurrence 
    // of a charterer in the string 
    Map<Character,Integer> mp = new HashMap<>(); 
    for (int i = 0; i < n; i++)  
        mp.put( str.charAt(i),mp.get( str.charAt(i))==null? 
                1:mp.get( str.charAt(i))+1); 
  
    int k = 0; // Count of singles 
    int num = 0; // numerator of result 
    int den = 1; // denominator of result 
    int fi;  
    for (Map.Entry<Character,Integer> it : mp.entrySet())  
    { 
        // if frequency is even  
        // fi = ci / 2 
        if (it.getValue() % 2 == 0)  
            fi = it.getValue() / 2; 
          
        // if frequency is odd  
        // fi = ci - 1 / 2. 
        else
        { 
            fi = (it.getValue() - 1) / 2;  
            k++; 
        } 
  
        // sum of all frequencies 
        num = num + fi;  
          
        // product of factorial of 
        // every frequency 
        den = den * fact(fi);  
    } 
      
    // if all character are unique  
    // so there will be no pallindrome,  
    // so if num != 0 then only we are 
    // finding the factorial 
    if (num != 0)  
        num = fact(num); 
          
    int ans = num / den;  
      
    if (k != 0) 
    { 
        // k are the single  
        // elements that can be 
        // placed in middle 
        ans = ans * k; 
    } 
      
    return (ans); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "ababab"; 
    int n = str.length(); 
    System.out.println(numberOfPossiblePallindrome(str, n)); 
} 
} 
