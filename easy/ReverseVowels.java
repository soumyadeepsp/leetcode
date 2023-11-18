package easy;

// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

import java.util.Scanner;

public class ReverseVowels {
    public static boolean isVowel(char c) {
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
            return true;
        } else {
            return false;
        }
    }
    public static String reverseVowels(String s) {
        int l = s.length();
        char[] c = new char[l];
        for (int i=0; i<l; i++) {
            c[i] = s.charAt(i);
        }
        int left = 0;
        int right = l-1;
        while (left<=right) {
            if (isVowel(c[left]) && isVowel(c[right])) {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                ++left;
                --right;
            } else if (!isVowel(c[left]) && isVowel(c[right])) {
                ++left;
            } else if (isVowel(c[left]) && !isVowel(c[right])) {
                --right;
            } else {
                ++left;
                --right;
            }
        }
        String ans = "";
        for (int i=0; i<c.length; i++) {
            ans = ans + c[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        reverseVowels(s);
        scan.close();
    }
}
