import java.util.*;

// Given a string s and a character c that occurs in s, return an array
// of integers answer where answer.length == s.length and answer[i] is the distance
// from index i to the closest occurrence of character c in s.
// The distance between two indices i and j is abs(i - j),
// where abs is the absolute value function.

public class ShortestDistanceToCharacter {
    public static int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        for (int i=0; i<s.length(); i++) {
            int c1 = 0;
            boolean f1 = false;
            for (int j=i; j<s.length(); j++) {
                if (s.charAt(j)==c) {
                    f1 = true;
                    break;
                } else {
                    ++c1;
                }
            }
            int c2 = 0;
            boolean f2 = false;
            for (int j=i; j>=0; j--) {
                if (s.charAt(j)==c) {
                    f2 = true;
                    break;
                } else {
                    ++c2;
                }
            }
            if (f1==false && f2==true) {
                ans[i] = c2;
            } else if (f2==false && f1==true) {
                ans[i] = c1;
            } else {
                ans[i] = Math.min(c1, c2);
            }
        }
        return ans;
    }    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}