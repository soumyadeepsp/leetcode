import java.util.*;

// You are given an array of characters letters that is sorted in non-decreasing order,
// and a character target. There are at least two different characters in letters.
// Return the smallest character in letters that is lexicographically greater than target.
// If such a character does not exist, return the first character in letters.

public class FindSmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length-1;
        char ans = letters[letters.length-1];
        if ((int)target>(int)letters[letters.length-1]) {
            return letters[0];
        }
        if ((int)target<(int)letters[0]) {
            return letters[0];
        }
        while (low<=high) {
            int mid = (low+high)/2;
            if ((int)letters[mid]>(int)target && (int)letters[mid]<(int)ans) {
                ans = letters[mid];
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}