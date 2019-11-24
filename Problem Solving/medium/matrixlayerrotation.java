import java.io.*;
import java.util.*;

public class matrixlayerrotation {

    public static void main(String[] args) {
        int r,c,n;
        Scanner s= new Scanner(System.in);
        r = s.nextInt();
        c = s.nextInt();
        n = s.nextInt();
        int[][] mat = new int[r][c];
        int[][] res = new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j] = s.nextInt();
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++){
                int row = i,col = j;
                int layer = Math.min(Math.min(i,j),Math.min(r-i-1,c-j-1));
                int param = (r+c-2)*2-8*layer; //no of elements in array
                if(param==0){
                    res[i][j] = mat[i][j];
                    return;
                }
                int rot = n%param;
                while(rot-->0){
                    if(row==layer&&col==layer)
                        row++;
                    else if(row==layer&&col==c-layer-1)
                        col--;
                    else if(row==r-layer-1&&col==layer)
                        col++;
                    else if(row==r-layer-1&&col==c-layer-1)
                        row--;
                    else if(row==layer)
                        col--;
                    else if(col==layer)
                        row++;
                    else if(row==r-layer-1)
                        col++;
                    else if(col==c-layer-1)
                        row--;
                }
               // System.out.println(row+" "+col+" by "+i+" "+j);
                res[row][col] = mat[i][j];
            }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(res[i][j]+" ");
            System.out.println();
        }
        
    }
}
