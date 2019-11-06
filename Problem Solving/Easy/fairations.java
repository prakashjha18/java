import java.util.*;
public class fairations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        int sum = 0;
        for(int i=0; i < N; i++){
            B[i] = in.nextInt();
            sum+=B[i];
        }

        int count = 0;
        if(sum % 2 == 1){
            System.out.println("NO");
        }
        else{
            for(int i = 0; i<N; i++){
                if(B[i] % 2 != 0){
                    B[i] = B[i] + 1;
                    B[i+1] = B[i+1] + 1;
                    count+=2;
                }
            }
            System.out.println(count);
        }
    }
}
