

import java.util.Scanner;

public class AddBinary {
    public static String addBinary(String a, String b) {
        String ans = "";
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while (i>=0 && j>=0) {
            char x1 = a.charAt(i);
            char x2 = b.charAt(j);
            int x = Integer.parseInt(x1+"") + Integer.parseInt(x2+"") + carry;
            carry = x/2;
            ans = x%2 + ans;
            i--; j--;
        }
        while (i>=0) {
            char x1 = a.charAt(i);
            int x = Integer.parseInt(x1+"") + carry;
            carry = x/2;
            ans = x%2 + ans;
            i--;
        }
        while (j>=0) {
            char x2 = b.charAt(j);
            int x = Integer.parseInt(x2+"") + carry;
            carry = x/2;
            ans = x%2 + ans;
            j--;
        }
        if (carry==1) {
            ans = carry + ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        System.out.println(addBinary(a, b));
        scan.close();
    }
}
