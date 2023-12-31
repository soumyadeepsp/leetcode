

import java.util.Scanner;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n<=0) {
            return false;
        }
        if (n==1) {
            return true;
        }
        if (n%3!=0) {
            return false;
        }
        return isPowerOfThree(n/3);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isPowerOfThree(n));
        scan.close();
    }
}
