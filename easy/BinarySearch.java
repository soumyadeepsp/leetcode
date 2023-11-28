import java.util.*;

// Given an array of integers nums which is sorted in ascending order,
// and an integer target, write a function to search target in nums. 
// If target exists, then return its index. Otherwise, return -1.

public class BinarySearch {
    public static int search(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while (left<=right) {
            int mid = (left+right)/2;
            if (arr[mid]==target) {
                return mid;
            } else if (arr[mid]<target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}