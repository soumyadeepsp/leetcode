import java.util.*;

// The Hamming distance between two integers is the number of positions at which 
// the corresponding bits are different.
// Given two integers x and y, return the Hamming distance between them.

public class HammingDistance {
    public static int countSetBits(int n) {
        int c = 0;
        while (n>0) {
            c = c + (n&1);
            n>>=1;
        }
        return c;
    }
    public static int hammingDistance(int x, int y) {
        int r = x^y;
        return countSetBits(r);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}