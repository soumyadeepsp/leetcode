

import java.util.Scanner;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int c = 0;
        for (int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i)!=' ') {
                ++c;
            }
            if (i>0 && s.charAt(i)!=' ' && s.charAt(i-1)==' ') {
                break;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(lengthOfLastWord(s));
        scan.close();
    }
}
