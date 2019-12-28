import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class lilyshomeworkk {

    // Complete the lilysHomework function below.
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
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=sortedarr[i]){
                swaps2++;
                hmap.put(arr[i],hmap.get(sortedarr[i]));
                int temp=arr[i];
                arr[i]=sortedarr[i];
                arr[hmap.get(sortedarr[i])]=temp;
                
                hmap.put(sortedarr[i],i);

            }
        }
        return Math.min(swaps,swaps2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = lilysHomework(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
