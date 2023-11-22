import java.util.*;

// You are given a sorted unique integer array nums.
// A range [a,b] is the set of all integers from a to b (inclusive).
// Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
// That is, each element of nums is covered by exactly one of the ranges, 
// and there is no integer x such that x is in one of the ranges but not in nums.

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> arr = new ArrayList<>();
        if (nums.length==0) {
            return arr;
        }
        if (nums.length==1) {
            arr.add(nums[0]+"");
            return arr;
        }
        String t = nums[0]+"";
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i+1]-nums[i]==1) {
                continue;
            } else {
                if (!t.equals(nums[i]+"")) {
                    t = t + "->" + nums[i];
                    arr.add(t);
                    t = nums[i+1]+"";
                } else {
                    arr.add(t);
                    t = nums[i+1]+"";
                }
            }
        }
        if (nums[nums.length-1]-nums[nums.length-2]!=1) {
            arr.add(nums[nums.length-1]+"");
        } else {
            arr.add(t+"->"+nums[nums.length-1]);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}