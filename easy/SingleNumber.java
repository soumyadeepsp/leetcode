package easy;

import java.util.Scanner;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int ans = nums[0];
        for (int i=1; i<nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(singleNumber(arr));
        scan.close();
    }
}
