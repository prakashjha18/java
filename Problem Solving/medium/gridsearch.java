import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class gridsearch {

    // Complete the gridSearch function below.
    static String gridSearch(String[] G, String[] P) {
        for(int i=0;i<G.length;i++){
            for(int j=0;j<G[i].length();j++){
                if(G[i].charAt(j) == P[0].charAt(0)){
                    System.out.println("a clue"+i+" "+j+G[i].charAt(j));
                    if (isMatch(i,j,G,P)){
                        System.out.println("it is a match");
                        return "YES";
                    }
                }
                System.out.println(i+"+"+j);
            }
        }
        return "NO";
    }
    static boolean isMatch(int rw, int clumn,String[] G, String[] P)
    {
        if(rw + P.length-1 > G.length-1)
           return false;
       if(clumn + P[0].length()-1 > G[0].length()-1)
           return false;
  
      
       for(int k=0,row=rw; k< P.length;k++,row++)
       {
           for(int l=0,column=clumn; l<P[k].length();l++,column++)
           {
               if(G[row].charAt(column) != P[k].charAt(l)) {
                    System.out.println("no work at"+k+" "+l);
                   return false;
               }
               
           }
           
          
       }
       return true;

        
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] RC = scanner.nextLine().split(" ");

            int R = Integer.parseInt(RC[0]);

            int C = Integer.parseInt(RC[1]);

            String[] G = new String[R];

            for (int i = 0; i < R; i++) {
                String GItem = scanner.nextLine();
                G[i] = GItem;
            }

            String[] rc = scanner.nextLine().split(" ");

            int r = Integer.parseInt(rc[0]);

            int c = Integer.parseInt(rc[1]);

            String[] P = new String[r];

            for (int i = 0; i < r; i++) {
                String PItem = scanner.nextLine();
                P[i] = PItem;
            }

            String result = gridSearch(G, P);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
