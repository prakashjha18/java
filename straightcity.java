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

public class Solution {



    // Complete the closestStraightCity function below.
    static List<String> closestStraightCity(List<String> c, List<Integer> x, List<Integer> y, List<String> q) {
        List<String> result = new ArrayList<>(); 
        

        for(int i=0;i<q.size();i++){
            int in=c.indexOf(q.get(i));
            long xcord=x.get(in);
            long ycord=y.get(in);
            // System.out.println(in+" .. "+xcord+" .. "+ycord);
            long dist=Long.MAX_VALUE;
            String city="";
            for(int j=0;j<c.size();j++){
                if((x.get(j)==xcord || y.get(j)==ycord) && j!=in ){
                    long tempdist=Math.abs(xcord-x.get(j))+Math.abs(ycord-y.get(j));
                    if(tempdist<dist){
                        dist=tempdist;
                        
                        city=c.get(j);
                    }else if(tempdist==dist){
                        String tempcity=c.get(j);
                        if(tempcity.compareTo(city)<city.length()){
                            city=tempcity;
                        }
                    }
                }
            }
            result.add(city);
        }

        return result;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int cCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> c = new ArrayList<>();

        IntStream.range(0, cCount).forEach(i -> {
            try {
                c.add(bufferedReader.readLine());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int xCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> xTemp = new ArrayList<>();

        IntStream.range(0, xCount).forEach(i -> {
            try {
                xTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> x = xTemp.stream()
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int yCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> yTemp = new ArrayList<>();

        IntStream.range(0, yCount).forEach(i -> {
            try {
                yTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> y = yTemp.stream()
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int qCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> q = new ArrayList<>();

        IntStream.range(0, qCount).forEach(i -> {
            try {
                q.add(bufferedReader.readLine());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<String> res = closestStraightCity(c, x, y, q);

        bufferedWriter.write(
            res.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
