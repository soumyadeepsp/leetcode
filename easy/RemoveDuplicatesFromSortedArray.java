

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void removeDuplicatesFromSortedArray(int[] arr, int low, int high) {
        if (low>=high) {
            return;
        }
        removeDuplicatesFromSortedArray(arr, low+1, high);
        if (arr[low+1]==arr[low]) {
            for (int i=low+2; i<=high; i++) {
                arr[i-1] = arr[i];
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int c = 1;
        for (int i=1; i<arr.length; i++) {
            if (arr[i]!=arr[i-1]) {
                ++c;
            }
        }
        System.out.println("number of unique elements = " + c);
        removeDuplicatesFromSortedArray(arr, 0, n-1);
        scan.close();
    }
}
