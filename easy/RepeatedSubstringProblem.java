import java.util.*;

// Given a string s, check if it can be constructed by taking a substring of it
// and appending multiple copies of the substring together.

public class RepeatedSubstringProblem {
    public static boolean repeatedSubstringPattern(String s) {
        int c = 1;
        int period = 0;
        while (c<s.length()) {
            if (s.length()%c==0) {
                String ans = "";
                String x = s.substring(0, c+1);
                for (int i=1; i<=s.length()/c; i++) {
                    ans = ans + x;
                }
                if (ans.equals(s) && c>period) {
                    period = c;
                }
            }
            ++c;
        }
        if (period==0) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}