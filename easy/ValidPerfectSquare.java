import java.util.*;

// given a number tell whether it is a perfect square or not using binary search

public class ValidPerfectSquare {
    public static boolean validPerfectSquare(int n) {
        if (n<=1) {
            return true;
        }
        long low = 0;
        long high = n;
        while (low<=high) {
            long mid = (low+high)/2;
            long square = mid*mid;
            if (square==n) {
                return true;
            } else if (square<n) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}