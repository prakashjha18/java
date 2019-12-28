import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class lilysHomeworkk {
    static int lilysHomework(int[] arr) {
        int sortedarr[] =  new int[arr.length];
        int swaps = 0, swaps2=0;
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int i =0;i<arr.length;i++){
            sortedarr[i]=arr[i];
            hmap.put(arr[i],i);
        }
        Arrays.sort(sortedarr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=sortedarr[i]){
                swaps++;
                hmap.put(arr[i],hmap.get(sortedarr[i]));
                int temp=arr[i];
                arr[i]=sortedarr[i];
                arr[hmap.get(sortedarr[i])]=temp;
                
                hmap.put(sortedarr[i],i);

            }
        }
        return swaps;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] revarr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            revarr[n-1-i]=arr[i];
        }
        int result = lilysHomework(arr);
        int result2 = lilysHomework(revarr);
        System.out.println(Math.min(result,result2));
    }
}
