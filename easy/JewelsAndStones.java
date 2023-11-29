import java.util.*;

// You're given strings jewels representing the types of stones that are jewels,
// and stones representing the stones you have.
// Each character in stones is a type of stone you have.
// You want to know how many of the stones you have are also jewels.
// Letters are case sensitive, so "a" is considered a different type of stone from "A".

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Boolean> map = new HashMap<>();
        for (int i=0; i<jewels.length(); i++) {
            char c = jewels.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, true);
            }
        }
        int c = 0;
        for (int i=0; i<stones.length(); i++) {
            if (map.containsKey(stones.charAt(i))) {
                ++c;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}