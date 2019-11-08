import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class happyladybugs {

    // Complete the happyLadybugs function below.
    static String happyLadybugs(String b) {
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)!='_' && count(b,b.charAt(i))==1){
                return "NO";
            }
        }
        if(count(b,'_')==0){
            for(int i=1;i<b.length()-1;i++){
                if((b.charAt(i-1)!=b.charAt(i)) && (b.charAt(i+1)!=b.charAt(i))){
                    return "NO";
                }
            }
        }
        return "YES";
    }
    static int count (String b, char a){
        int count =0;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)==a){
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int gItr = 0; gItr < g; gItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String b = scanner.nextLine();

            String result = happyLadybugs(b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
