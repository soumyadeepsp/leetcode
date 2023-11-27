

// Given an integer array nums, move all 0's to the end of it while maintaining the 
// relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.

import java.util.Scanner;

public class MoveZeroes {
    public static void moveZeroes(int[] arr) {
        int p = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]!=0) {
                int temp = arr[p];
                arr[p] = arr[i];
                arr[i] = temp;
                ++p;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        moveZeroes(arr);
        scan.close();
    }
}
