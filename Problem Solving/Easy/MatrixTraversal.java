// Objective
// A matrix and a valid current position (row number and column number) are provided as input. Given a direction (RIGHT is 1, DOWN in 2, LEFT is 3 and UP is 4) and number of steps to move, output the values along the path taken to the new position.

// If any position during traversal is out of bounds, including the initial position, output a single -1 in the list and not the values along the path. The matrix is guaranteed to have non-negative numbers. The direction will always be valid and the number of steps will always be > 0.

// Input Format & Example
// Example 1

// Input:

// 3 3 --> Matrix size

// 1 2 3 --> Input matrix of 3 rows

// 4 5 6

// 7 8 9

// 1 1 --> Current Position

// 1 1 --> Direction, # of steps; In this case move RIGHT by 1 step

// Output:

// 6

// Example 2

// Input:

// 3 4

// 1 2 3 4

// 5 6 7 8

// 9 10 11 12

// 0 2

// 2 2

// Output:

// 7 11

import java.io.*;
import java.util.*;

class MatrixTraversal  {

  // complete the below function implementation
  public boolean isValid(int currX, int rowlength, int currY, int colmlength) {
    if (currX >= 0 && currX < rowlength && currY >= 0 && currY < colmlength) {
      return true;
    }
    else {
      return false;
    }
  }
  public List<Integer> valueAtNewPosition(int[][] matrix, int currX, int currY, int dir, int steps) {
    List<Integer> lst = new ArrayList<Integer>();
    List<Integer> lst1 = new ArrayList<Integer>();
    int boundX = matrix[0].length;
    int boundY = matrix.length;
    for(int i = 0; i < steps; i++){
      if(dir == 1) {
        currY++;
      } else if(dir == 2) {
        currX++;
      } else if(dir == 3) {
        currY--;
      } else {
        currX++;
      }
      if(!isValid(currX, boundY, currY, boundX)) {
        lst1.add(-1);
        return lst1;
      }
      else {
        lst.add(matrix[currX][currY]);
      }
    }
    return lst;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[][] matrix = new int[n][m];

    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < m; ++j) {
        matrix[i][j] = scanner.nextInt();
      }
    }
    int currPosX = scanner.nextInt();
    int currPosY = scanner.nextInt();
    int dirToMove = scanner.nextInt();
    int stepsToMove = scanner.nextInt();

    scanner.close();
     List<Integer> result = new MatrixTraversal().valueAtNewPosition(matrix, currPosX, currPosY, dirToMove, stepsToMove);

    for (int i = 0; i < result.size(); ++i) {
      System.out.printf("%d ", result.get(i));
    }
  }
}
