import java.util.*;

// You are given a license key represented as a string s that consists of 
// only alphanumeric characters and dashes. The string is separated into n + 1 groups
//  by n dashes. You are also given an integer k.
// We want to reformat the string s such that each group contains exactly k characters, 
// except for the first group, which could be shorter than k but still must contain
// at least one character. Furthermore, there must be a dash inserted between two groups, 
// and you should convert all lowercase letters to uppercase.
// Return the reformatted license key.

public class LicenseKeyFormatting {
    public static String licenseKeyFormatting(String s, int k) {
        String newS = "";
        for (int i=0; i<s.length(); i++) {
            char x = s.charAt(i);
            int ascii = (int)x;
            if ((ascii>=65 && ascii<=90) || (ascii>=48 && ascii<=57)) {
                newS = newS + x;
            }
            if (ascii>=97 && ascii<=122) {
                newS = newS + (char)(ascii-32);
            }
        }
        int c = 0;
        int p = newS.length()-1;
        String ans = "";
        while (p>=0) {
            if (c==k) {
                ans = "-" + ans;
                c = 0;
            }
            ans = newS.charAt(p) + ans;
            --p;
            ++c;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}