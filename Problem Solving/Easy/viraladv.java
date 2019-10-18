import java.util.*;
public class viraladv {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int people = 5;
        int sum = 0;
        
        for(int i = 0; i < num; i++){
            people = (int) Math.floor(people/2);
            sum += people;
            people *= 3;
        }
        System.out.println(sum);
    }
}
