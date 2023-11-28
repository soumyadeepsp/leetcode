import java.util.*;

// You have a set of integers s, which originally contains all the numbers from 1 to n.
// Unfortunately, due to some error, one of the numbers in s got duplicated to another number
// in the set, which results in repetition of one number and loss of another number.
// You are given an integer array nums representing the 
// data status of this set after the error.
// Find the number that occurs twice and the number that is missing 
// and return them in the form of an array.

public class SetMismatch {
    public static int[] findErrorNums(int[] arr) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++) {
            if (map.containsKey(arr[i])) {
                ans[0] = arr[i];
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int i=1; i<arr.length+1; i++) {
            if (!map.containsKey(i)) {
                ans[1] = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}