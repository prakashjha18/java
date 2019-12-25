import java.util.*;
class largestpermutation { 
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n,k,i,count;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        n=sc.nextInt();
        int[] a=new int[n];
        k=sc.nextInt();
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            hm.put(a[i],i);
        }//for
        count=0;
        i=0;
        while(i<n && count<k){
            int hold=hm.get(n-i);
            System.out.print(hold+"___");
            if(i!=hold){
                hm.put(n-i,i);
            hm.put(a[i],hold);
            int temp = a[i];
                a[i] = a[hold];
                a[hold] = temp;
            count+=1;
            }//if
            i+=1;
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
