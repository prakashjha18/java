import java.util.*;
public class Solution {
    private static int N = 26;
    private static boolean isAnagram(String a, String b) {
        int []countA = new int[N];
        int []countB = new int[N];
        for (char c : a.toCharArray()) {
            countA[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            countB[c - 'a']++;
        }
        for (int i = 0; i < N; i++) {
            if (countA[i] != countB[i]) {
                return false;
            }
        }
        return true;
    }
    private static int getPairsCount(String text) {
        int count = 0;
        int length = text.length();
        List<String> subsets = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j <= length; j++) {
                subsets.add(text.substring(i,  j));
            }
        }
        for (int i = 0; i < subsets.size(); i++) {
            for (int j = i + 1; j < subsets.size(); j++) {
                String s1 = subsets.get(i);
                String s2 = subsets.get(j);
                if (s1.length() == s2.length() && isAnagram(s1, s2)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println(getPairsCount(s.next()));
        }
    }
}
