import java.util.*;

// Given a string s, return the number of segments in the string.
// A segment is defined to be a contiguous sequence of non-space characters.

public class NumberOfSegmentsInAString {
    public static int countSegments(String s) {
        if (s.length()==0) {
            return 0;
        }
        int c = 0;
        for (int i=0; i<s.length()-1; i++) {
            if (s.charAt(i)!=' ' && s.charAt(i+1)==' ') {
                ++c;
            }
        }
        if (s.charAt(s.length()-1)!=' ') {
            ++c;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
