import java.util.*;

// The next greater element of some element x in an array is the first greater element
//  that is to the right of x in the same array.
// You are given two distinct 0-indexed integer arrays nums1 and nums2, 
// where nums1 is a subset of nums2.
// For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j]
//  and determine the next greater element of nums2[j] in nums2. 
// If there is no next greater element, then the answer for this query is -1.
// Return an array ans of length nums1.length such that ans[i]
// is the next greater element as described above.

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr1.length; i++) {
            map.put(arr1[i], i);
        }
        int[] ans = new int[arr1.length];
        for (int i=0; i<arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                boolean found = false;
                for (int j=i+1; j<arr2.length; j++) {
                    if (arr2[j]>arr2[i]) {
                        ans[map.get(arr2[i])] = arr2[j];
                        found = true;
                        break;
                    }
                }
                if (found==false) {
                    ans[map.get(arr2[i])] = -1;
                }
            }
        }
        return ans;
    }
    public int[] nextGreaterElementBetter(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr1.length; i++) {
            map.put(arr1[i], i);
        }
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[arr1.length];
        for (int i=0; i<arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                if (s.isEmpty() || s.peek()>arr2[i]) {
                    s.add(arr2[i]);
                } else {
                    while (!s.isEmpty() && s.peek()<arr2[i]) {
                        int temp = s.pop();
                        ans[map.get(temp)] = arr2[i];
                    }
                    s.add(arr2[i]);
                }
            } else {
                while (!s.isEmpty() && s.peek()<arr2[i]) {
                    int temp = s.pop();
                    ans[map.get(temp)] = arr2[i];
                }
            }
        }
        while (!s.isEmpty()) {
            ans[map.get(s.pop())] = -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}