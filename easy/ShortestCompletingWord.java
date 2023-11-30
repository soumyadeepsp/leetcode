import java.util.*;

// Given a string licensePlate and an array of strings words, 
// find the shortest completing word in words.
// A completing word is a word that contains all the letters in licensePlate.
// Ignore numbers and spaces in licensePlate, and treat letters as case insensitive.
// If a letter appears more than once in licensePlate, 
// then it must appear in the word the same number of times or more.
// For example, if licensePlate = "aBc 12c", then it contains letters 'a', 'b' (ignoring case),
// and 'c' twice. Possible completing words are "abccdef", "caaacab", and "cbca".
// Return the shortest completing word in words. It is guaranteed an answer exists.
// If there are multiple shortest completing words, return the first one that occurs in words.

public class ShortestCompletingWord {
    public static boolean isComplete(HashMap<Character, Integer> map, String word) {
        HashMap<Character, Integer> f = new HashMap<>();
        for (int i=0; i<word.length(); i++) {
            if (f.containsKey(word.charAt(i))) {
                f.put(word.charAt(i), f.get(word.charAt(i))+1);
            } else {
                f.put(word.charAt(i), 1);
            }
        }
        Set<Character> mapkeys = map.keySet();
        for (Character c : mapkeys) {
            if (!f.containsKey(c)) {
                return false;
            }
            if (map.get(c)>f.get(c)) {
                return false;
            }
        }
        return true;
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        String ans = "";
        for (int i=0; i<licensePlate.length(); i++) {
            char c = licensePlate.charAt(i);
            if ((int)c>=48 && (int)c<=57) {
                continue;
            }
            if ((int)c==32) {
                continue;
            }
            c = Character.toLowerCase(c);
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i=0; i<words.length; i++) {
            if (isComplete(map, words[i])) {
                if (ans.equals("")) {
                    ans = words[i];
                } else {
                    if (words[i].length()<ans.length()) {
                        ans = words[i];
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}