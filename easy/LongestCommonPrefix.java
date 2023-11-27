

import java.util.Scanner;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] arr) {
        int min_length = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (arr[i].length()<min_length) {
                min_length = arr[i].length();
            }
        }
        String ans = "";
        int c = 0;
        for (int j=0; j<min_length; j++) {
            char x = arr[0].charAt(j);
            for (int i=0; i<arr.length; i++) {
                if (arr[i].charAt(j)!=x) {
                    ++c;
                }
            }
            if (c==0) {
                ans = ans + x;
            } else {
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        for (int i=0; i<n; i++) {
            arr[i] = scan.next();
        }
        scan.close();
        System.out.println(longestCommonPrefix(arr));
    }
}
