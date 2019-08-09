import java.util.*;
import java.lang.Math;
public class transposecipher
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the plain text");
        String pl=sc.nextLine();
        String demo="";
        String s="";
        int start=0;
        for(int i=0;i<pl.length();i++)
        {
            if(pl.charAt(i)==' ')
            {
                s=s+pl.substring(start,i);
                start=i+1;
            }
        }
        s=s+pl.substring(start);
        System.out.print(s);
        System.out.println();
        //end of space deletion
        
        int k=s.length();
        int l=0;
        int col=4;
        String c  = "#";
        double r=Math.ceil((double)s.length()/col);
        int row  = (int)r;
        char ch[][]=new char[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(l<k)
                {
                    ch[i][j]=s.charAt(l);
                    l++;
                }
                else
                {
                    ch[i][j]='#';
                }
            }
        }
        //arranged in matrix
        
        char trans[][]=new char[col][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                trans[j][i]=ch[i][j];
            }
        }
        System.out.println("------------------------encrypted message--------------------------");
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                if(trans[i][j] == c.charAt(0))
                {
                    continue;
                }
                else 
                {
                    System.out.print(trans[i][j]);
                }
            }
        }
        System.out.println();
        System.out.println("----------------------------decrypted----------------------------");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(trans[j][i] == c.charAt(0))
                {
                    continue;
                }
                else 
                {
                    System.out.print(trans[j][i]);
                }
            }
        }
        //display
        System.out.println();
        
    }
}
