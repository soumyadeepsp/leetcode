import java.util.*;

// Given an unsorted array of integers nums, return the length of the 
// longest continuous increasing subsequence (i.e. subarray). 
// The subsequence must be strictly increasing.
// A continuous increasing subsequence is defined by two indices l and r (l < r)
// such that it is [nums[l], nums[l + 1], ..., nums[r - 1], 
// nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].

public class LongestContinuousIncreasingSubsequence {
    public static int findLengthOfLCIS(int[] arr) {
        int left = 0;
        int right = left+1;
        int ans = 0;
        int c = 1;
        while (left<arr.length && right<arr.length) {
            if (arr[right]>arr[left]) {
                ++right;
                ++left;
                ++c;
            } else {
                if (c>ans) {
                    ans = c;
                }
                left = right;
                right = left+1;
                c = 1;
            }
        }
        if (c>ans) {
            ans = c;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}