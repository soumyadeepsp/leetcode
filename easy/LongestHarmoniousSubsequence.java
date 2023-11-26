import java.util.*;

// We define a harmonious array as an array where the difference 
// between its maximum value and its minimum value is exactly 1.
// Given an integer array nums, return the length of its 
// longest harmonious subsequence among all its possible subsequences.
// A subsequence of array is a sequence that can be derived from the array 
// by deleting some or no elements without changing the order of the remaining elements.

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int l = 0;
        Arrays.sort(arr);
        for (int i=0; i<arr.length-1; i++) {
            if (map.containsKey(arr[i]) && map.containsKey(arr[i]+1)) {
                if (map.get(i)+map.get(arr[i]+1) > l) {
                    l = map.get(i)+map.get(i+1);
                }
            }
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}