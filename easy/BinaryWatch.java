import java.util.*;

// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original string 
// by deleting some (can be none) of the characters without disturbing the 
// relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).


public class BinaryWatch {
    public static List<String> binaryWatch(int num) {
        List<String> ans = new ArrayList<>();
        for (int i=0; i<12; i++) {
            for (int j=0; j<60; j++) {
                if (Integer.bitCount(i)+Integer.bitCount(j)==num) {
                    ans.add(i + (j < 10 ? ":0" : ":") + j);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
