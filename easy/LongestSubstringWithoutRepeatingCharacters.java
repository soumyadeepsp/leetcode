import java.util.*;

// Given a string s, find the length of the longest substring without repeating characters.

public class LongestSubstringWithoutRepeatingCharacters {
    public static String longestSubstringWithoutRepeatingCharacters(String s) {
        HashMap<Character, Boolean> map = new HashMap<>();
        String ans = "";
        int high = 0;
        while (high<s.length()) {
            if (!map.containsKey(s.charAt(high))) {
                System.out.println(high+" "+ans);
                ans = ans + s.charAt(high);
                map.put(s.charAt(high), true);
                ++high;
            } else {
                System.out.println(high+" "+ans);
                ans = ans.substring(1);
                ans = ans + s.charAt(high);
                ++high;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(longestSubstringWithoutRepeatingCharacters(s));
        scan.close();
    }
}