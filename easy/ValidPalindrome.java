

// A phrase is a palindrome if, after converting all uppercase letters into 
// lowercase letters and removing all non-alphanumeric characters, 
// it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.

import java.util.Scanner;

public class ValidPalindrome {
    public static boolean isPalindrome(String str) {
        String s = "";
        for (int i=0; i<str.length(); i++) {
            int ascii = (int)str.charAt(i);
            if (ascii>=97 && ascii<=122) {
                s = s + str.charAt(i);
            }
            if (ascii>=65 && ascii<=90) {
                s = s + (char)(ascii+32);
            }
            if (ascii>=48 && ascii<=57) {
                s = s + str.charAt(i);
            }
        }
        int left = 0;
        int right = s.length()-1;
        while (left<=right) {
            if (s.charAt(left)!=s.charAt(right)) {
                return false;
            } else {
                ++left;
                --right;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(isPalindrome(s));
        scan.close();
    }
}
