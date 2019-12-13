import java.util.*;
public class closestnos {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[2*n];
        int min = Integer.MAX_VALUE,k=0;
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        for(int i=0;i<n-1;i++)
        {
            if(Math.abs(a[i]-a[i+1])==min)
            {
                b[k++]=a[i];
                b[k++]=a[i+1];
            }
            else if(Math.abs(a[i]-a[i+1])<min)
            {
            k=0;
                b[k++]=a[i];
                b[k++]=a[i+1];
                min=Math.abs(a[i]-a[i+1]);   
            }
        }
        for(int i=0;i<k;i++)
        System.out.print(b[i]+" ");
    }
}
