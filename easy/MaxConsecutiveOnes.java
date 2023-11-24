import java.util.*;

// Given a binary array nums, return the maximum number of consecutive 1's in the array.

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] arr) {
        int c = 0;
        int max = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==1) {
                ++c;
            } else {
                max = Math.max(c, max);
                c = 0;
            }
        }
        max = Math.max(c, max);
        return max;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}