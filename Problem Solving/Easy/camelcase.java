import java.util.*;

public class camelcase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int terms = 1;
        for (int i = 0; i < s.length(); i++) {
            String letter = Character.toString(s.charAt(i));
            if (letter == letter.toUpperCase()) {
                terms++;
            }
        }
        System.out.println(terms);
    }
}
