import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class organizecontainers {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int qItr = 0; qItr < q; qItr++) {
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {
                    int x = in.nextInt();
                    a[i] += x;
                    b[j] += x;
                }
            }
            String pts = "Possible";
            for(int i=0;i<n;i++)
            {
                int j=0;
                for(j=i;j<n;j++)
                {
                    if(a[i] == b[j])
                    {
                        int temp = b[j];
                        b[j] = b[i];
                        b[i] = temp;
                        //System.out.println(i+""+j);
                        break;
                    }
                }
                if(j==n)
                {
                    pts = "Impossible";
                    break;
                }
                // if(a[i] == b[i])
                // {
                //     pts = "Possible";
                // }
                // else{
                //     pts = "Impossible";
                //     break;
                // }
            }
            System.out.println(pts);
        }

    }
}
