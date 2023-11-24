import java.util.*;

// Given an integer num, return a string of its base 7 representation.

public class Base7 {
    public static String convertToBase7(int n) {
        if (n==0) {
            return "0";
        }
        boolean isNeg = false;
        if (n<0) {
            n = n*-1;
            isNeg = true;
        }
        String ans = "";
        while (n>0) {
            ans = n%7 + ans;
            n = n/7;
        }
        if (isNeg) { 
            ans = "-"+ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}