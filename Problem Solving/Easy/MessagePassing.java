// Write a program to find if the message from a friend standing at one end of the spiral tunnel can reach another friend at the other end.
// Input Format

// First line contains N, S and M, which are the size of the square maze(N*N), strength of the first friend’s voice and the number of people standing in the maze. Next M lines contain the position of each person in the maze and their voice strength.

// 1 ≤ N ≤ 103

// 1 ≤ M ≤ 105

// Output Format

// Print 'Yes' if the message could reach from the friend at the beginning to the friend at the end, else print 'No' (case-sensitive).

// Input 1

// 4 5 4 --> Size is 4 * 4, first friend’s strength is 5, number of people is 4

// 0 3 2 --> First person’s position is 0,3 in the matrix. Their strength is 2

// 2 3 5

// 3 1 4

// 1 1 5

// Output 1

// Yes

// Explanation 1

// Y is the friend at the beginning. Z is the friend at the end. P are the other people.

// 0 1 2 3

// 0 Y(5) X X P1(3)

// 1 X P4(5) X X

// 2 X Z X P2(5)

// 3 X P3(4) X X

// When Y speaks, voice will travel 5 cells through the following path and reach person1 and person2.

// (0, 0)Y -> (0, 1) -> (0, 2) -> (0, 3)P1 -> (1, 3)

// (2, 3)P2 -> (3, 3) -> (3, 2) -> (3, 1)P3 -> . . .

// Following the spiral path, the message will be passed from P3 to P4 and then finally to Z.
import java.io.*;
import java.util.*;

class MessagePassing  {

  // Complete the below function implementation
  // Print "Yes" for success and "No" for Failure
  public void messagePassTest(int n, int s, int m, int[][] matrix) {
    if(n == 1)
    System.out.println("Yes");
    else if(s == 0)
    System.out.println("No");
   else {
    matrix[0][0] = s;
    boolean t = spiralOrder(matrix);
    if(t == true) 
     System.out.println("Yes");
    else
    System.out.println("No");
   }
    
  }
  public boolean spiralOrder(int[][] matrix) {
    int strength = matrix[0][0];
    int currR=0,row=matrix.length - 1,currC=0,col=matrix[0].length - 1;
    while(currR <= row && currC <= col) {
        for (int i = currC; i <= col; i++) {
            // lst.add(matrix[currR][i]);
            if (currR != 0 && i !=0 ) {
              strength--;
            }
            if((currR == row && currC == col) && strength == 0)
             return true;
            else if (strength == 0 && matrix[currR][i] == 0) {
              return false;
            } else {
              if(matrix[currR][i] > strength) {
                strength = matrix[currR][i];
              }  
            }
        }
        for (int i = currR + 1; i <= row; i++) {
            // lst.add(matrix[i][col]);
            strength--;
            if((currR == row && currC == col) && strength == 0)
             return true;
            else if (strength == 0 && matrix[currR][i] == 0) {
              return false;
            } else {
              if(matrix[i][col] > strength) {
                strength = matrix[i][col];
              }  
            }
        }
        if(currR < row && currC < col) {
            for (int j = col - 1; j > currC; j--) {
                // lst.add(matrix[row][j]);
              strength--;
            if((currR == row && currC == col) && strength == 0)
              return true;
            else if (strength == 0 && matrix[row][j] == 0) {
                return false;
              } else {
                if(matrix[row][j] > strength) {
                  strength = matrix[row][j];
                }  
              }
            }
            for (int k = row; k > currR; k--) {
                // lst.add(matrix[k][currC]);
              strength--;
              if((currR == row && currC == col) && strength == 0)
                return true;
              else if (strength == 0 && matrix[k][currC] == 0) {
                return false;
              } else {
                if(matrix[k][currC] > strength) {
                  strength = matrix[k][currC];
                }  
              }
            }
        }
        currR++;
        row--;
        currC++;
        col--;
    }
    return true;
  }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int s = scanner.nextInt();
    int m = scanner.nextInt();
    int[][] matrix = new int[n][n];

    for(int i = 0 ; i < m ; ++i) {
        int x , y , p;
        x = scanner.nextInt();
        y = scanner.nextInt();
        p = scanner.nextInt();
        matrix[x][y] = Math.max(p, matrix[x][y]);
    }
    scanner.close();
    new MessagePassing().messagePassTest(n,s,m,matrix);
  }
}
