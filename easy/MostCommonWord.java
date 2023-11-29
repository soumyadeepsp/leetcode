import java.util.*;

// Given a string paragraph and a string array of the banned words banned,
// return the most frequent word that is not banned.
// It is guaranteed there is at least one word that is not banned, and that the answer is unique.
// The words in paragraph are case-insensitive and the answer should be returned in lowercase.

public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int i=0; i<paragraph.length(); i++) {
            if (paragraph.charAt(i)==' ') {
                if (!word.equals("")) {
                    words.add(word);
                    word = "";
                }
                continue;
            }
            if (!(((int)(paragraph.charAt(i))>=65 && (int)(paragraph.charAt(i))<=90) || ((int)(paragraph.charAt(i))>=97 && (int)(paragraph.charAt(i))<=122))) {
                if (!word.equals("")) {
                    words.add(word);
                    word = "";
                }
                continue;
            } 
            word = word + Character.toLowerCase(paragraph.charAt(i));
        }
        words.add(word);
        HashMap<String, Boolean> bannedmap = new HashMap<>();
        for (int i=0; i<banned.length; i++) {
            bannedmap.put(banned[i], true);
        }
        System.out.println(bannedmap);
        System.out.println(words);
        HashMap<String, Integer> f = new HashMap<>();
        for (int i=0; i<words.size(); i++) {
            if (bannedmap.containsKey(words.get(i))) {
                continue;
            } else {
                if (words.get(i).equals("")) {
                    continue;
                }
                if (f.containsKey(words.get(i))) {
                    f.put(words.get(i), f.get(words.get(i))+1);
                } else {
                    f.put(words.get(i), 1);
                }
            }
        }
        System.out.println(f);
        int largestFreq = Integer.MIN_VALUE;
        String largestWord = "";
        Set<String> keys = f.keySet();
        for (String s : keys) {
            if (f.get(s)>largestFreq) {
                largestFreq = f.get(s);
                largestWord = s;
            }
        }
        return largestWord;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}