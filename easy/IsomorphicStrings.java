package easy;

import java.util.HashMap;

// Given two strings s and t, determine if they are isomorphic.
// Two strings s and t are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while 
// preserving the order of characters. No two characters may map to the same character, 
// but a character may map to itself.

import java.util.Scanner;

public class IsomorphicStrings {
    public static boolean isomorphicStrings(String s, String t) {
        if (s.length()!=t.length()) {
            return false;
        }
        HashMap<Character, Character> m1 = new HashMap<>();
        HashMap<Character, Character> m2 = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if (m1.containsKey(s.charAt(i)) && m1.get(s.charAt(i))!=t.charAt(i)) {
                return false;
            } else if (m2.containsKey(t.charAt(i)) && m2.get(t.charAt(i))!=s.charAt(i)) {
                return false;
            } else {
                m1.put(s.charAt(i), t.charAt(i));
                m2.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();
        System.out.println(isomorphicStrings(s, t));
        scan.close();
    }
}
