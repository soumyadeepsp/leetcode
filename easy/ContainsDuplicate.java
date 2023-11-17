package easy;
import java.util.Arrays;
import java.util.Scanner;

// Given an integer array nums, return true if any value appears at least 
// twice in the array, and return false if every element is distinct.

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i]==nums[i+1]) {
                return true;
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
        System.out.println(containsDuplicate(arr));
        scan.close();
    }
}
