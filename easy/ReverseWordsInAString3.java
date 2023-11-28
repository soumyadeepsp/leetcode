import java.util.Scanner;

// Given a string s, reverse the order of characters in each word within a sentence
//  while still preserving whitespace and initial word order.

public class ReverseWordsInAString3 {
    public static String reverse(String s) {
        String ans = "";
        for (int i=0; i<s.length(); i++) {
            ans = s.charAt(i) + ans;
        }
        return ans;
    }
    public static String reverseWords(String s) {
        String temp = "";
        String ans = "";
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)==' ') {
                ans = ans + reverse(temp) + " ";
                temp = "";
            } else {
                temp = temp + s.charAt(i);
            }
        }
        ans = ans + reverse(temp);
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
