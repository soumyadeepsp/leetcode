import java.util.*;

// Given a string s which consists of lowercase or uppercase letters, 
// return the length of the longest palindrome that can be built with those letters.
// Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

public class LongestPalindrom {
    public static int longestPalindrome(String s) {
        int l = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        int flag = 0;
        Set<Character> keys = map.keySet();
        if (keys.size()==1) {
            return s.length();
        }
        for (Character x : keys) {
            if (map.get(x)%2==0) {
                l = l + map.get(x);
            } else {
                l = l + map.get(x)-1;
                flag = 1;
            }
        }
        if (flag==1) {
            l++;
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
