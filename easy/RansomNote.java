import java.util.*;

// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
// Each letter in magazine can only be used once in ransomNote.

public class RansomNote {
    public static boolean ransomNote(String ransomNote, String magazine) {
        HashMap<Character, Integer> rmap = new HashMap<>();
        HashMap<Character, Integer> mmap = new HashMap<>();
        for (int i=0; i<ransomNote.length(); i++) {
            if (rmap.containsKey(ransomNote.charAt(i))) {
                int currentFreq = rmap.get(ransomNote.charAt(i));
                rmap.put(ransomNote.charAt(i), currentFreq+1);
            } else {
                rmap.put(ransomNote.charAt(i), 1);
            }
        }
        for (int i=0; i<magazine.length(); i++) {
            if (mmap.containsKey(magazine.charAt(i))) {
                int currentFreq = mmap.get(magazine.charAt(i));
                mmap.put(magazine.charAt(i), currentFreq+1);
            } else {
                mmap.put(magazine.charAt(i), 1);
            }
        }
        Set<Character> keys = rmap.keySet();
        for (Character x : keys) {
            if (!mmap.containsKey(x)) {
                return false;
            }
            if (rmap.get(x)>mmap.get(x)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
