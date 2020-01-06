import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class gridlandmetroo {

    // Complete the gridlandMetro function below.
    static long gridlandMetro(long n, int m, int k, int[][] track) {
    Map<Integer, Stack<int[]>> map = new HashMap<>();
    for (int i = 0; i < k; i++) {
        int r = track[i][0];
        int c1 = track[i][1];
        int c2 = track[i][2];
        Stack<int[]> stack = map.get(r);
        if (stack == null) {
            stack = new Stack<>();
            stack.push(new int[] { c1, c2 });
            map.put(r, stack);
        } else {
            int[] c = stack.peek();
            if (c[1] >= c1)
                c[1] = Math.max(c[1], c2);
            else
                stack.push(new int[] { c1, c2 });
        }
    }
    return (long) n * m - map.values().stream().flatMap(Collection::stream).mapToLong(c -> c[1] - c[0] + 1).sum();
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nmk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nmk[0]);

        int m = Integer.parseInt(nmk[1]);

        int k = Integer.parseInt(nmk[2]);

        int[][] track = new int[k][3];

        for (int i = 0; i < k; i++) {
            String[] trackRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int trackItem = Integer.parseInt(trackRowItems[j]);
                track[i][j] = trackItem;
            }
        }

        long result = gridlandMetro(n, m, k, track);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
