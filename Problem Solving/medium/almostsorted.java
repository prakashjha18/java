import java.util.*;

public class almostsorted {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 2) System.out.println("yes");

        int[] d = new int[n];
        for (int i = 0; i < n; d[i++] = s.nextInt());

        if (isAsc(d))
            System.out.println("yes");
        
        int i, j;
        for (i = 0;     i < n - 1 && d[i] < d[i+1]; i++);
        for (j = n-1;   j > 0 && d[j-1] < d[j]; j--);

        // try swap
        swap(d, i, j);
        if (isAsc(d)) {
            System.out.println("yes\nswap "+ (i+1) + " " + (j+1));
            return;
        }

        // try reverse (continue reversing inner pairs)
        int k = i+1, l = j-1;
        while (k < l) swap(d, k++, l--);
        if (isAsc(d)) {
            System.out.println("yes\nreverse " + (i+1) + " " + (j+1));
            return;
        }
        System.out.println("no");
    }

    public static void swap(int[] d, int i, int j) {
        int tmp = d[i];
        d[i] = d[j];
        d[j] = tmp;
    }

    public static boolean isAsc(int[] d) {
        for (int i = 0; i < d.length-1; ++i) {
            if (d[i] > d[i+1]) return false;
        }
        return true;
    }
}
