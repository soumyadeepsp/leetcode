import java.util.*;

// You are given a string sentence that consist of words separated by spaces.
// Each word consists of lowercase and uppercase letters only.
// We would like to convert the sentence to "Goat Latin"
// (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:
// If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'),
// append "ma" to the end of the word.
// For example, the word "apple" becomes "applema".
// If a word begins with a consonant (i.e., not a vowel),
// remove the first letter and append it to the end, then add "ma".
// For example, the word "goat" becomes "oatgma".
// Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
// For example, the first word gets "a" added to the end,
// the second word gets "aa" added to the end, and so on.
// Return the final sentence representing the conversion from sentence to Goat Latin.

public class GoatLatin {
    public static String toGoatLatin(String sentence) {
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int i=0; i<sentence.length(); i++) {
            if (sentence.charAt(i)==' ') {
                words.add(word);
                word = "";
                continue;
            }
            word = word + sentence.charAt(i);
        }
        words.add(word);
        System.out.println(words);
        for (int i=0; i<words.size(); i++) {
            String w = words.get(i);
            if (w.charAt(0)=='a' || w.charAt(0)=='e' || w.charAt(0)=='i' || w.charAt(0)=='o' || w.charAt(0)=='u' || w.charAt(0)=='A' || w.charAt(0)=='E' || w.charAt(0)=='I' || w.charAt(0)=='O' || w.charAt(0)=='U') {
                w = w + "ma";
                for (int j=0; j<=i; j++) {
                    w = w + "a";
                }
            } else {
                w = w.substring(1) + w.charAt(0) + "ma";
                for (int j=0; j<=i; j++) {
                    w = w + "a";
                }
            }
            words.set(i, w);
        }
        String ans = "";
        for (int i=0; i<words.size(); i++) {
            ans = ans + words.get(i) + " ";
        }
        return ans.substring(0, ans.length()-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();    
    }
}