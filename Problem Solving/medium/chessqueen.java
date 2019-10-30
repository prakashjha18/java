import java.util.*; 
  
class chessqueen { 
   
    static int numberofPosition(int n, int k, int x,int y, int obstPosx[], int obstPosy[]) 
    { 
         
        int d11, d12, d21, d22, r1, r2, c1, c2; 
        d11 = Math.min( x-1, y-1 ); 
        d12 = Math.min( n-x, n-y ); 
        d21 = Math.min( n-x, y-1 ); 
        d22 = Math.min( x-1, n-y ); 
        r1 = y-1; 
        r2 = n-y; 
        c1 = x-1; 
        c2 = n-x; 
        for (int i = 0; i < k; i++) 
        { 
            if ( x > obstPosx[i] && y > obstPosy[i] && 
                    x-obstPosx[i] == y-obstPosy[i] ) 
                d11 = Math.min(d11, x-obstPosx[i]-1); 
      
            if ( obstPosx[i] > x && obstPosy[i] > y && 
                    obstPosx[i]-x == obstPosy[i]-y ) 
                d12 = Math.min( d12, obstPosx[i]-x-1); 
      
            if ( obstPosx[i] > x && y > obstPosy[i] && 
                    obstPosx[i]-x == y-obstPosy[i] ) 
                d21 = Math.min(d21, obstPosx[i]-x-1); 
      
            if ( x > obstPosx[i] && obstPosy[i] > y && 
                        x-obstPosx[i] == obstPosy[i]-y ) 
                d22 = Math.min(d22, x-obstPosx[i]-1); 
      
            if ( x == obstPosx[i] && obstPosy[i] < y ) 
                r1 = Math.min(r1, y-obstPosy[i]-1); 
      
            if ( x == obstPosx[i] && obstPosy[i] > y ) 
                r2 = Math.min(r2, obstPosy[i]-y-1); 
      
            if ( y == obstPosy[i] && obstPosx[i] < x ) 
                c1 = Math.min(c1, x-obstPosx[i]-1); 
      
            if ( y == obstPosy[i] && obstPosx[i] > x ) 
                c2 = Math.min(c2, obstPosx[i]-x-1); 
        } 
        return d11 + d12 + d21 + d22 + r1 + r2 + c1 + c2; 
    } 
      
    public static void main (String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Chessboard size 
        int k = sc.nextInt(); // number of obstacles 
        int Qposx = sc.nextInt(); // Queen x position 
        int Qposy = sc.nextInt(); // Queen y position 
        int obstPosx[] = new int[k];
        int obstPosy[] = new int[k];
        for(int i=0;i<k;i++){
            obstPosx[i] = sc.nextInt(); // x position of obstacles 
            obstPosy[i] = sc.nextInt(); // y position of obstacles
        }
        System.out.println(numberofPosition(n, k, Qposx,Qposy, obstPosx, obstPosy)); 
    } 
} 
