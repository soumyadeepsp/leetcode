import java.util.*;

// Given an integer array nums, return the third distinct maximum number in this array.
// If the third maximum does not exist, return the maximum number. Do it in O(n).

public class ThirdMaximumNumber {
    public static int thirdMax(int[] arr) {
        long firstLargest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;
        long thirdLargest = Long.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i]<firstLargest && arr[i]>secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } else if (arr[i]<secondLargest && arr[i]>thirdLargest) {
                thirdLargest = arr[i];
            } else {

            }
        }
        if (thirdLargest==Long.MIN_VALUE) {
            return (int)firstLargest;
        } else {
            return (int)thirdLargest;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
