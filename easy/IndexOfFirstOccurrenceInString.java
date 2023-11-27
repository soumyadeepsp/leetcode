

import java.util.Scanner;

public class IndexOfFirstOccurrenceInString {
    public static int strStr(String haystack, String needle) {
        for (int i=0; i<haystack.length(); i++) {
            if (haystack.charAt(i)==needle.charAt(0)) {
                int c = 0;
                for (int j=0; j<needle.length(); j++) {
                    if ((i+j<haystack.length()) && (haystack.charAt(i+j)==needle.charAt(j))) {
                        ++c;
                    }
                }
                if (c==needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String haystack = scan.next();
        String needle = scan.next();
        System.out.println(strStr(haystack, needle));
        scan.close();
    }
}
