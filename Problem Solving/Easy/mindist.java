import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class mindist {

        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int minDist= Integer.MAX_VALUE;
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            if(hm.containsKey(arr[i])) {
                int x=hm.get(arr[i]);
                int dist = i - x;
                if(dist < minDist) minDist = dist;
            }
            else hm.put(arr[i],i);            
        }
        if(minDist == Integer.MAX_VALUE) minDist=-1;
        System.out.println(minDist);
    }
}
