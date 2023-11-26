import java.util.*;

// Given an integer array nums of 2n integers, group these integers into n pairs
// (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) 
// for all i is maximized. Return the maximized sum.

public class ArrayPartition {
    public static int arrayPairSum(int[] arr) {
        Arrays.sort(arr);
        int s = 0;
        for (int i=0; i<arr.length; i=i+2) {
            s = s + arr[i];
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}