import java.util.Scanner;

public class insertionsortshift {

    public static void insertionSortShiftCounter(int[] array) {
        int shifts = 0;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int value = array[i];
            while (j >= 1 && array[j-1] > value) {
                array[j] = array[j-1];
                j--;
                shifts++;
            }
            array[j] = value;
        }
        System.out.println(shifts);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int[] array = new int[s];
        for (int i = 0; i < s; i++) {
            array[i] = scan.nextInt(); 
        }
        insertionSortShiftCounter(array);
    }
}
