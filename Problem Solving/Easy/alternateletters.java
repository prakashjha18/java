import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class alternateletters {

    // Complete the alternate function below.
    static int alternate(String s){ 
    HashSet<Character> char_set = new HashSet<Character>();

    for (int i = 0; i < s.length(); i++) {
        char_set.add(s.charAt(i));
    }

    Character[] char_arr = char_set.toArray(new Character[char_set.size()]);
    int max = 0;

    for (int j = 0; j < char_arr.length - 1; j++) {
        for (int k = j + 1; k < char_arr.length; k++) {
            String pattern = "([^" + char_arr[j] + char_arr[k] + "])";
            String trimmedStr = s.replaceAll(pattern, "");
            System.out.println(pattern+"____"+trimmedStr);
            if (isTwoCharacter(trimmedStr) && trimmedStr.length() > max) {
                max = trimmedStr.length();
            }
        }
    }
    return max;
}

static boolean isTwoCharacter(String s) {
    for (int i = 0; i < s.length() - 1; i++) {
        if (s.charAt(i) == s.charAt(i+1)) {
            return false;
        }
    }
    return true;
}

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
