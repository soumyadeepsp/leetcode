import java.util.*;

// Given a pattern and a string s, find if s follows the same pattern.
// Here follow means a full match, such that there is a bijection 
// between a letter in pattern and a non-empty word in s.

// Example 1:
// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
// Example 2:
// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        int spaces = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)==' ') {
                ++spaces;
            }
        }
        if (spaces!=pattern.length()-1) {
            return false;
        }
        HashMap<String, Character> map = new HashMap<>();
        String temp = "";
        int c = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)==' ') {
                ++spaces;
                if (map.containsKey(temp)) {
                    if (map.get(temp)!=pattern.charAt(c)) {
                        System.out.println(temp+" "+pattern.charAt(c));
                        return false;
                    } else {
                        ++c;
                        temp = "";
                        continue;
                    }
                } else {
                    if (map.containsValue(pattern.charAt(c))) {
                        return false;
                    }
                    map.put(temp, pattern.charAt(c));
                    ++c;
                    temp = "";
                }
            } else {
                temp = temp + s.charAt(i);
            }
        }
        if (map.containsKey(temp)) {
            if (map.get(temp)==pattern.charAt(pattern.length()-1)) {
                return true;
            } else {
                return false;
            }
        } else {
            if (map.containsValue(pattern.charAt(pattern.length()-1))) {
                return false;
            } else {
                return true;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}