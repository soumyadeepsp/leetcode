
import java.util.Arrays;
import java.util.Scanner;

// Given an integer array nums and an integer k, return true if there are 
// two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

public class ContainsDuplicates2 {
    public static boolean containsDuplicate(int[] nums, int k) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<=i+k; j++) {
                if (j<nums.length && nums[i]==nums[j]) {
                    return true;
                }
            }
        }
        if (k>=nums.length) {
            Arrays.sort(nums);
            for (int i=0; i<nums.length-1; i++) {
                if (nums[i]==nums[i+1]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        System.out.println(containsDuplicate(arr, k));
        scan.close();
    }
}
