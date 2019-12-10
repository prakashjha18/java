import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class thefullcountingsort {

    // Complete the countSort function below.
    static void countSort(List<List<String>> arr) {
        for(int i=0;i<(arr.size()/2);i++){
            arr.get(i).set(1,"-");
        }
        StringBuilder[] sb=new StringBuilder[100];
        for(int i=0;i<100;i++)
        {
            sb[i]=new StringBuilder();
        }
        for(int i=0;i<arr.size();i++){
            sb[Integer.parseInt(arr.get(i).get(0))].append(arr.get(i).get(1)+" ".toString());
        }
        for(int i=0;i<100;i++){
            System.out.print(sb[i].toString());
        }
       
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")));
        }

        countSort(arr);

        bufferedReader.close();
    }
}
