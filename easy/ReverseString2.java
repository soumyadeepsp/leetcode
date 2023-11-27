import java.util.Scanner;

// Given a string s and an integer k, reverse the first k characters for every 
// 2k characters counting from the start of the string.
// If there are fewer than k characters left, reverse all of them.
// If there are less than 2k but greater than or equal to k characters, 
// then reverse the first k characters and leave the other as original.

public class ReverseString2 {
    public static void reverse(char[] arr, int low, int high) {
        if (high>=arr.length) {
            high = arr.length-1;
        }
        while (low<high) {
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            ++low;
            --high;
        }
    }
    public static String reverseStr(String s, int k) {
        char[] arr = new char[s.length()];
        for (int i=0; i<s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        for (int i=0; i<s.length(); i=i+2*k) {
            System.out.println(i+" "+(i+k-1));
            reverse(arr, i, i+k-1);
        }
        String ans = "";
        for (int i=0; i<arr.length; i++) {
            ans = ans + arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
