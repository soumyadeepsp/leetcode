import java.util.*;

// A perfect number is a positive integer that is equal to the sum of its positive divisors,
// excluding the number itself. A divisor of an integer x is an integer 
// that can divide x evenly.
// Given an integer n, return true if n is a perfect number, otherwise return false.

public class Perfectnumber {
    public boolean checkPerfectNumber(int n) {
        if (n==1) {
            return false;
        }
        int s = 1;
        double rootn = Math.pow(n, 0.5);
        for (int i=2; i<rootn; i++) {
            if (n%i==0) {
                s = s + i + n/i;
            }
        }
        if (rootn*rootn==n) {
            s = s + (int)rootn;
        }
        if (s==n) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}