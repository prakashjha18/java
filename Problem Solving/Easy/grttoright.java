import java.util.*;
public class grttoright{
    public static void main(String[] args){
        int n=6;
        int[] arr={16,17,4,3,5,2};
        int earr[]=new int[n];
        earr[0]=arr[n-1];
        int curr_max=arr[n-1],j=1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>curr_max){
                curr_max = arr[i];
                earr[j++]=curr_max;
            }
        }
        for(int no: earr){
            System.out.print(no+" ");
        }
    }
}
