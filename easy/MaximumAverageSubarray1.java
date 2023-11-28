import java.util.*;

// You are given an integer array nums consisting of n elements, and an integer k.
// Find a contiguous subarray whose length is equal to k that has the maximum average value
// and return this value. Any answer with a calculation error less than 10-5 will be accepted.

public class MaximumAverageSubarray1 {
    public static double findMaxAverage(int[] arr, int k) {
        int s = 0;
        for (int i=0; i<k; i++) {
            s = s + arr[i];
        }
        int max = s;
        for (int i=k; i<arr.length; i++) {
            s = s + arr[i] - arr[i-k];
            if (s>max) {
                max = s;
            }
        }
        return (double)max/(double)k;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}