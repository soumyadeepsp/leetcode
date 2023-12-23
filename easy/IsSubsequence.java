import java.util.*;

// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original string 
// by deleting some (can be none) of the characters without disturbing the 
// relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).


public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int p1 = 0;
        int p2 = 0;
        while (p1<s.length() && p2<t.length()) {
            if (s.charAt(p1)==t.charAt(p2)) {
                ++p1;
                ++p2;
            } else {
                ++p2;
            }
        }
        if (p1==s.length()) {
            return true;
        } else {
            if (p2==t.length()) {
                if (p1==s.length()) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
