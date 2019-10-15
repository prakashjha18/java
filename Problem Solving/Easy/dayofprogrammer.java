import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class dayofprogrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        int mon7 = 215;
        int feb; //days in february
        if(year < 1918) //julian
            feb = year%4==0 ? 29 : 28;
        else if(year > 1918) //gregorian
            feb = (year%400==0) || (!(year%100==0)&&(year%4==0)) ? 29 : 28;
        else //dreaded 1918
            feb = 15;
        feb = 256 - (feb + mon7);
        return Integer.toString(feb) + ".09." + Integer.toString(year);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
