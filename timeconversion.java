import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class timeconversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        char[] inChar = s.toCharArray();
        char[] out = Arrays.copyOfRange(inChar, 0, 8);
        if(inChar[8] == 'A' && s.substring(0,2).equals("12")) {
            out[0] = '0';
            out[1] = '0';
        }
        else if(inChar[8] =='P' && !s.substring(0,2).equals("12")) {
            String s1 = "" + (Integer.parseInt(s.substring(0,2)) + 12);
            char[] f = s1.toCharArray();
            out[0] = f[0];
            out[1] = f[1];
        }
        String string = String.copyValueOf(out);
        return string;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
