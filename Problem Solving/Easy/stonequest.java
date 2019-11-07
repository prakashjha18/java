import java.util.*;
public class stonequest {

    static String answer(int n, int one, int two) {
        int a = Math.min(one,two);
        int b = Math.max(one,two);
        
        if(a == b)
            return ((n-1)*a) + "";
        
        String output = "";
        for(int i = 0; i < n; i++)
            output += (a * (n-i-1) + b * i) + " ";
        
        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            System.out.println(answer(in.nextInt(), in.nextInt(), in.nextInt()));
        }
        in.close();
    }
}
