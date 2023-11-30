import java.util.*;

// Given an array of integers nums, calculate the pivot index of this array.
// The pivot index is the index where the sum of all the numbers strictly to the left
// of the index is equal to the sum of all the numbers strictly to the index's right.
// If the index is on the left edge of the array, then the left sum is 0
// because there are no elements to the left. This also applies to the right edge of the array.
// Return the leftmost pivot index. If no such index exists, return -1.

public class PivotIndex {
    public static int pivotIndex(int[] arr) {
        int[] leftSum = new int[arr.length];
        int[] rightSum = new int[arr.length];
        int s = 0;
        for (int i=0; i<arr.length; i++) {
            s = s + arr[i];
            leftSum[i] = s;
        }
        s = 0;
        for (int i=arr.length-1; i>=0; i--) {
            s = s + arr[i];
            rightSum[i] = s;
        }
        for (int i=0; i<arr.length; i++) {
            if (leftSum[i]==rightSum[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}