

import java.util.HashMap;
import java.util.Scanner;

// Given an array nums containing n distinct numbers in the range [0, n], 
// return the only number in the range that is missing from the array.

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], true);
        }
        for (int i=0; i<nums.length+1; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(missingNumber(arr));
        scan.close();
    }
}
