 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class gameofthroness {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
         int flag=0;
         int letter[] = new int[26];
         for (int i = 0; i < s.length(); i++) {
            letter[s.charAt(i) - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < 26; i++){
            if (letter[i] % 2 == 1) {
                count++;
            }
        }
        if (count > 1) {
            flag = 1;
        }

        if (flag==0)
            return "YES";
        else
            return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
