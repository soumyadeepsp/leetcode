package easy;

import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] fs = new int[26];
        for (int i=0; i<s.length(); i++) {
            fs[s.charAt(i)-97] = fs[s.charAt(i)-97] + 1;
        }
        int[] ft = new int[26];
        for (int i=0; i<t.length(); i++) {
            ft[t.charAt(i)-97] = ft[t.charAt(i)-97] + 1;
        }
        for (int i=0; i<26; i++) {
            if (fs[i]!=ft[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();
        System.out.println(isAnagram(s, t));
        scan.close();
    }
}
