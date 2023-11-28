import java.util.*;

// Given a non-empty array of non-negative integers nums, the degree of this array
// is defined as the maximum frequency of any one of its elements.
// Your task is to find the smallest possible length of a (contiguous) subarray of nums,
// that has the same degree as nums.

public class DegreeOfAnArray {
    public static int findShortestSubArray(int[] arr) {
        HashMap<Integer, Integer> f = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            if (f.containsKey(arr[i])) {
                f.put(arr[i], f.get(arr[i])+1);
            } else {
                f.put(arr[i], 1);
            }
        }
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.get(arr[i]).add(i);
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(arr[i], temp);
            }
        }
        int max = 0;
        int l = 0;
        for (int i=0; i<arr.length; i++) {
            if (f.get(arr[i])==max) {
                if (map.get(arr[i]).get(map.get(arr[i]).size()-1) - map.get(arr[i]).get(0) < l) {
                    l = map.get(arr[i]).get(map.get(arr[i]).size()-1) - map.get(arr[i]).get(0);
                }
            }
            if (f.get(arr[i])>max) {
                max = f.get(arr[i]);
                l = map.get(arr[i]).get(map.get(arr[i]).size()-1) - map.get(arr[i]).get(0);
            }
        }
        return l+1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}