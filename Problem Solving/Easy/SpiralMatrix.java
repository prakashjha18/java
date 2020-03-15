//Given an input matrix of size m x n, output the elements of the matrix in spiral order. Leverage the functions you have created in the previous module if need be.
import java.io.*;
import java.util.*;
class SpiralMatrix {
    // Implement your solution by completing the below function
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst = new ArrayList<Integer>();
        if(matrix.length == 0) {
            return lst;
        }
        int currR=0,row=matrix.length - 1,currC=0,col=matrix[0].length - 1;
        while(currR <= row && currC <= col) {
            for (int i = currC; i <= col; i++) {
                lst.add(matrix[currR][i]);
            }
            for (int i = currR + 1; i <= row; i++) {
                lst.add(matrix[i][col]);
            }
            if(currR < row && currC < col) {
                for (int j = col - 1; j > currC; j--) {
                    lst.add(matrix[row][j]);
                }
                for (int k = row; k > currR; k--) {
                    lst.add(matrix[k][currC]);
                }
            }
            currR++;
            row--;
            currC++;
            col--;
        }
        return lst;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                matrix[i][j] = scanner.nextInt();
        scanner.close();

        List<Integer> result = new SpiralMatrix().spiralOrder(matrix);
        for (int i = 0; i < result.size(); ++i)
            System.out.printf("%d ", result.get(i));
    }
}
