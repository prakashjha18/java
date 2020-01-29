class towerofhanoi
{ 
    // Java recursive function to solve tower of hanoi puzzle 
    static void towerOfHanoi(int n, char A, char B, char C) 
    {
        if (n >0) 
        { 
            towerOfHanoi(n-1, A, C, B); 
            System.out.println("Move disk " + n + " from rod " +  A + " to rod " + C); 
            towerOfHanoi(n-1, B, A, C); 
        } 
        
    }
      
    //  Driver method 
    public static void main(String args[]) 
    {
        int n = 2; // Number of disks 
        towerOfHanoi(n, 'A', 'B', 'C');  // A, B and C are names of rods 
    } 
}
