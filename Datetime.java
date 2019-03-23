import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.DayOfWeek;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
            
            StringBuilder sb=new StringBuilder();
            String day1=Integer.toString(day);sb.append(day1);sb.append("/");

            String month1=Integer.toString(month);sb.append(month1);sb.append("/");
            String year1=Integer.toString(year);sb.append(year1);

            System.out.println(sb);
            SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
            try{
            Date dt1=format1.parse(sb.toString());
            DateFormat format2=new SimpleDateFormat("EEEE"); 
            String finalDay=format2.format(dt1);
            return finalDay.toUpperCase();
            }
            catch (ParseException e) {
            return("Can't parse input of ");
            // also probably a log.error(e)
            }
            
            
            
    }

}

public class Datetime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
