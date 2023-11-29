import java.util.*;

// You are given an integer array nums where the largest integer is unique.
// Determine whether the largest element in the array is at least twice
// as much as every other number in the array. If it is, 
// return the index of the largest element, or return -1 otherwise.

public class LargestNumberAtleastTwiceOfOthers {
    public static int dominantIndex(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int index = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]>largest) {
                largest = arr[i];
                index = i;
            }
        }
        for (int i=0; i<arr.length; i++) {
            if (arr[i]!=largest) {
                if (arr[i]*2<=largest) {
                    continue;
                } else {
                    return -1;
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}