import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class enryyption {

    //Complete the encryption function below.
    public static void encryption(String string) {
        int row = (int)Math.floor(Math.sqrt(string.length()));
        int column = (int)Math.ceil(Math.sqrt(string.length()));
        if(row * column < string.length()) row = column;
        for(int i = 0; i < column; i++){
            for(int j = i; j < string.length(); j = j + column ){
                System.out.print(string.charAt(j));
            }
            System.out.print(" ");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String string = scanner.nextLine();
        encryption(string);
    }
}
