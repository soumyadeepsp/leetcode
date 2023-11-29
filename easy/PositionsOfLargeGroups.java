import java.util.*;

// In a string s of lowercase letters, these letters form consecutive groups
// of the same character.
// For example, a string like s = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z", and "yy".
// A group is identified by an interval [start, end], where start and end denote
// the start and end indices (inclusive) of the group.
// In the above example, "xxxx" has the interval [3,6].
// A group is considered large if it has 3 or more characters.
// Return the intervals of every large group sorted in increasing order by start index.

public class PositionsOfLargeGroups {
    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        char prev = s.charAt(0);
        char curr;
        int start = 0;
        int end = 0;
        for (int i=1; i<s.length(); i++) {
            curr = s.charAt(i);
            if (curr==prev) {
                ++end;
            } else {
                if (end-start>=2) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(start);
                    temp.add(end);
                    ans.add(temp);
                }
                start = i;
                end = i;
            }
            prev = curr;
        }
        if (end-start>=2) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(end);
            ans.add(temp);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}