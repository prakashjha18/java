// Java program to find minimum number  
// of times 'A' has to be repeated  
// such that 'B' is a substring of it 
class minsubsrepetion  
{
    // Function to check if a number  
    // is a substring of other or not 
    static boolean issubstring(String str2,String rep1) 
    {
        int M = str2.length(); 
        int N = rep1.length(); 
    
        // Check for substring from starting  
        // from i'th index of main string 
        for (int i = 0; i <= N - M; i++)  
        { 
            int j; 
    
            // For current index i,  
            // check for pattern match 
            for (j = 0; j < M; j++) 
                if (rep1.charAt(i + j) != str2.charAt(j)) 
                    break; 
    
            if (j == M) // pattern matched 
                return true; 
        } 
    
        return false; // not a substring 
    } 
    // Function to find Minimum number  
    // of times 'A' has to be repeated  
    // such that 'B' is a substring of it 
    static int Min_repetation(String A, String B) 
    { 
        // To store minimum number of repetations 
        int ans = 1; 
        
        // To store repeated string 
        String S = A; 
        
        // Untill size of S is less than B 
        while(S.length() < B.length()) 
        { 
            S += A; 
            ans++; 
        } 
        // ans times repetation makes required answer 
        if (issubstring(B, S)) return ans; 
        
        // Add one more string of A  
        if (issubstring(B, S + A))  
            return ans + 1; 
            
        // If no such solution exits  
        return -1; 
    } 
    // Driver code 
    public static void main(String[] args)  
    { 
        String A = "abcd", B = "cdabcdab"; 
        // Function call 
        System.out.println(Min_repetation(A, B)); 
    }
}
