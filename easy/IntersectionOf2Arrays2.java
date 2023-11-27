

import java.util.ArrayList;

// Given two integer arrays nums1 and nums2, return an array of their intersection. 
// Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOf2Arrays2 {
    public static int[] intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i]==arr2[j]) {
                ans.add(arr1[i]);
                ++i;
                ++j;
            } else if (arr1[i]<arr2[j]) {
                i++;
            } else if (arr1[i]>arr2[j]) {
                j++;
            } else {}
        }
        int[] temp = new int[ans.size()];
        for (i=0; i<ans.size(); i++) {
            temp[i] = ans.get(i);
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i=0; i<n1; i++) {
            arr1[i] = scan.nextInt();
        }
        for (int i=0; i<n2; i++) {
            arr2[i] = scan.nextInt();
        }
        int[] ans = intersection(arr1, arr2);
        for (int i=0; i<ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        scan.close();
    }
}
