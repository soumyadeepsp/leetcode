import java.util.*;

// Given an unsorted array of integers nums, return the length of the 
// longest continuous increasing subsequence (i.e. subarray). 
// The subsequence must be strictly increasing.
// A continuous increasing subsequence is defined by two indices l and r (l < r)
// such that it is [nums[l], nums[l + 1], ..., nums[r - 1], 
// nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].

public class BasecallGame {
    public static int calPoints(String[] operations) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i<operations.length; i++) {
            if (operations[i].equals("C")) {
                arr.remove(arr.size()-1);
            } else if (operations[i].equals("D")) {
                arr.add(2*arr.get(arr.size()-1));
            } else if (operations[i].equals("+")) {
                arr.add(arr.get(arr.size()-1)+arr.get(arr.size()-2));
            } else {
                arr.add(Integer.parseInt(operations[i]));
            }
        }
        int s = 0;
        for (int i=0; i<arr.size(); i++) {
            s = s + arr.get(i);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}