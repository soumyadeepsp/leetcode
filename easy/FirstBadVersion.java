package easy;

// You are a product manager and currently leading a team to develop a new product. 
// Unfortunately, the latest version of your product fails the quality check. 
// Since each version is developed based on the previous version, all the versions after a bad version are also bad.
// Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, 
// which causes all the following ones to be bad.
// You are given an API bool isBadVersion(version) which returns whether version is bad. 
// Implement a function to find the first bad version. You should minimize the number of calls to the API.

import java.util.Scanner;

public class FirstBadVersion {
    public static int b = 0;
    public static boolean isBadVersion(int n) {
        if (n<=b) {
            return true;
        } else {
            return false;
        }
    }
    public static int firstBadVersion(int n) {
        long low = 1;
        long high = n;
        long pos = high;
        while (low<=high) {
            long mid = (low+high)/2;
            if (isBadVersion((int)mid)==true) {
                pos = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return (int)pos;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        b = scan.nextInt();
        System.out.println(firstBadVersion(n));
        scan.close();
    }
}
