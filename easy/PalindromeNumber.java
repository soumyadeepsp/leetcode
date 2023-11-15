package easy;

import java.util.Scanner;

class PalindromeNumber {
    public static boolean isPalindrome(int n) {
        if (n<0) {
            return false;
        }
        int revertedN = 0;
        int x = n;
        while (n>0) {
            revertedN = revertedN*10 + n%10;
            n = n/10;
        }
        System.out.println(x+" "+revertedN);
        if (x==revertedN) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isPalindrome(n));
        scan.close();
    }
}