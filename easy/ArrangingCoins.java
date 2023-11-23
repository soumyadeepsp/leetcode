import java.util.*;

// You have n coins and you want to build a staircase with these coins.
// The staircase consists of k rows where the ith row has exactly i coins.
// The last row of the staircase may be incomplete.
// Given the integer n, return the number of complete rows of the staircase you will build.

public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        if (n==1) {
            return 1;
        }
        int i = 1;
        int c = 0;
        while (n>=0) {
            n = n-i;
            i++;
            ++c;
        }
        return c-1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
