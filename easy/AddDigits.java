package easy;

import java.util.Scanner;

public class AddDigits {
    public static int addDigits(int n) {
        int s = 0;
        while (n>9) {
            while (n>0) {
                s = s + n%10;
                n = n/10;
            }
            n = s;
            s = 0;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(addDigits(n));
        scan.close();
    }
}
