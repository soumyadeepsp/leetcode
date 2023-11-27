

import java.util.HashMap;
import java.util.Scanner;

public class HappyNumber {
    public static boolean isHappy(int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        while (true) {
            int c = 0;
            while (n>0) {
                int lastDigit = n%10;
                c = c + lastDigit*lastDigit;
                n = n/10;
            }
            n = c;
            if (map.containsKey(c)) {
                return false;
            }
            if (c==1) {
                return true;
            }
            map.put(c, true);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isHappy(n));
        scan.close();
    }
}
