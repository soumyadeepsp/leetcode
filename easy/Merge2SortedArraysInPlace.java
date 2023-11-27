

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Merge2SortedArraysInPlace {
    public static List<Integer> list = new LinkedList<>();
    public static void merge2SortedArraysInPlace(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int c = 0;
        while (i<n+m && j<n) {
            if (c==m) {
                break;
            }
            if (nums1[i]<=nums2[j] && c<m) {
                ++i;
                ++c;
            } else {
                for (int x=n+m-2; x>=i; x--) {
                    nums1[x+1] = nums1[x];
                }
                nums1[i] = nums2[j];
                ++j;
                ++i;
            }
        }
        while (j<n) {
            nums1[i] = nums2[j];
            ++i;
            ++j;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for (int i=0; i<m; i++) {
            arr1[i] = scan.nextInt();
        }
        for (int i=0; i<n; i++) {
            arr2[i] = scan.nextInt();
        }
        merge2SortedArraysInPlace(arr1, m, arr2, n);
        scan.close();
    }
}
