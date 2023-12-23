import java.util.*;

// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

public class FirstUniqueCharacterInAString {
    public static int firstUniqueCharacterInAString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i=0; i<s.length(); i++) {
            if (map.get(s.charAt(i))==1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
