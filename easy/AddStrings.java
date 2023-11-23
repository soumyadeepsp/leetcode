import java.util.*;

// Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
// You must solve the problem without using any built-in library for 
// handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

public class AddStrings {
    public String addStrings(String num1, String num2) {
        int s = 0;
        int carry = 0;
        int p1 = num1.length()-1;
        int p2 = num2.length()-1;
        String ans = "";
        while (p1>=0 && p2>=0) {
            int c1 = num1.charAt(p1) - '0';
            int c2 = num2.charAt(p2) - '0';
            int c = c1+c2+carry;
            if (c<10) {
                s = c;
                carry = 0;
            } else {
                s = c%10;
                carry = c/10;
            }
            ans = s + ans;
            p1--;
            p2--;
        }
        while (p1>=0) {
            int c1 = num1.charAt(p1) - '0';
            int c = c1 + carry;
            if (c<10) {
                s = c;
                carry = 0;
            } else {
                s = c%10;
                carry = c/10;
            }
            ans = s + ans;
            p1--;
        }
        while (p2>=0) {
            int c2 = num2.charAt(p2) - '0';
            int c = c2 + carry;
            if (c<10) {
                s = c;
                carry = 0;
            } else {
                s = c%10;
                carry = c/10;
            }
            ans = s + ans;
            p2--;
        }
        if (carry==1) {
            ans = "1"+ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
