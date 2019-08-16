import java.lang.Math;

public class diffie
{
    static int power( int a,  int b,int P) 
    {  
        if (b == 1) 
            return a; 
      
        else
            return (((int)Math.pow(a, b)) % P); 
    } 
    static boolean isprimee(int num)
    {
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
        return flag;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int P, G, x, a, y, b, ka, kb;  
      
    
        P = 23; 
        System.out.println("The value of P : " + P);  
      
        G = 9; // A primitve root for P, G is taken 
        System.out.println("The value of G : "+ G); 
       
        if(!isprimee(P) || !isprimee(G))
        {
                // Alice will choose the private key a  
            a = 4; // a is the chosen private key  
            System.out.println("The private key a for Alice : %lld\n"+a); 
            x = power(G, a, P); // gets the generated key 
              
            // Bob will choose the private key b 
            b = 3; // b is the chosen private key 
            System.out.println("The private key b for Bob : %lld\n\n"+ b); 
            y = power(G, b, P); // gets the generated key 
          
            // Generating the secret key after the exchange 
                // of keys 
            ka = power(y, a, P); // Secret key for Alice 
            kb = power(x, b, P); // Secret key for Bob 
              
            System.out.println("Secret key for the Alice is : %lld\n"+ ka); 
            System.out.println("Secret Key for the Bob is : %lld\n"+ kb); 
        }
        else 
        {
            System.out.println("both values should be prime");
        }
    }
	
}
