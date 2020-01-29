class towerofhanoi
{ 
    // Java recursive function to solve tower of hanoi puzzle 
    static void towerOfHanoi(int n, char A, char B, char C) 
    { 
        if (n == 1) 
        { 
            System.out.println("Move disk 1 from rod " +  A + " to rod " + B); 
            return; 
        } 
        towerOfHanoi(n-1, A, C, B); 
        System.out.println("Move disk " + n + " from rod " +  A + " to rod " + B); 
        towerOfHanoi(n-1, C, B, A); 
    } 
      
    //  Driver method 
    public static void main(String args[]) 
    { 
        int n = 3; // Number of disks 
        towerOfHanoi(n, 'A', 'C', 'B');  // A, B and C are names of rods 
    } 
}
