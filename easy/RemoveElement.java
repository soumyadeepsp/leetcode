package easy;

import java.util.Scanner;

public class RemoveElement {
    public static void removeElement(int[] arr, int low, int high, int val) {
        if (low>=high) {
            return;
        }
        removeElement(arr, low+1, high, val);
        if (arr[low]==val) {
            for (int i=low+1; i<=high; i++) {
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
        int val = scan.nextInt();
        int c = 0;
        for (int i=0; i<n; i++) {
            if (arr[i]!=val) {
                ++c;
            }
        }
        System.out.println("Number of elements left after removing val = " + c);
        removeElement(arr, 0, n-1, val);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        scan.close();
    }
}
