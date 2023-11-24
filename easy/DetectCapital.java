import java.util.*;

// We define the usage of capitals in a word to be right when one of the following cases holds:
// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int x = 0;
        for (int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            int ascii = (int)c;
            if (ascii>=65 && ascii<=90) {
                ++x;
            }
        }
        if (x>1 && x<word.length()) {
            return false;
        } else {
            if (x==1 && !((int)word.charAt(0)>=65 && (int)word.charAt(0)<=90)) {
                return false;
            } else {
                return true;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}