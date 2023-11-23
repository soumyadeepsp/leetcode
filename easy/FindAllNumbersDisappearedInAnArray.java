import java.util.*;

// Given an array nums of n integers where nums[i] is in the range [1, n], 
// return an array of all the integers in the range [1, n] that do not appear in nums.

public class FindAllNumbersDisappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            map.put(arr[i], true);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i=1; i<=arr.length; i++) {
            if (!map.containsKey(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
