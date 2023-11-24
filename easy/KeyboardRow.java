import java.util.*;

// Given an array of strings words, return the words that can be typed using 
// letters of the alphabet on only one row of American keyboard like the image below.
// In the American keyboard:
// the first row consists of the characters "qwertyuiop",
// the second row consists of the characters "asdfghjkl", and
// the third row consists of the characters "zxcvbnm".

public class KeyboardRow {
    public static int getRow(char c) {
        String firstRow = "qwertyuiopQWERTYUIOP";
        String secondRow = "asdfghjklASDFGHJKL";
        if (firstRow.contains(c+"")) {
            return 1;
        } else if (secondRow.contains(c+"")) {
            return 2;
        } else {
            return 3;
        }
    }
    public String[] findWords(String[] words) {
        List<String> arr = new ArrayList<>();
        for (int i=0; i<words.length; i++) {
            String w = words[i];
            int row = getRow(w.charAt(0));
            boolean flag = true;
            for (int j=0; j<w.length(); j++) {
                if (getRow(w.charAt(j))!=row) {
                    flag = false;
                }
            }
            if (flag==true) {
                arr.add(w);
            }
        }
        String[] ans = new String[arr.size()];
        for (int i=0; i<arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}