import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class acmicpcteam {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
        int[] res = new int[2];
        int[] counts = new int[500];
        //System.out.println(topic[1].charAt(0));
        int max = 0;
        for(int i=0;i<topic.length-1;i++){
            for(int j=i+1;j<topic.length;j++){
                int count=0;
                for(int k=0;k<topic[i].length();k++){
                    
                    if(topic[i].charAt(k)=='1' || topic[j].charAt(k)=='1'){
                        count++;
                        
                    }
                }
                counts[count]++;
                if(count>max){
                    max = count;
                }
                
            }
        }
        res[0] = max;
        res[1] = counts[max];
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
