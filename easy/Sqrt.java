package easy;

import java.util.Scanner;

public class Sqrt {
    public static int sqrt(int x) {
        if (x==0 || x==1) {
            return x;
        }
        long ans = 0;
        long low = 0;
        long high = x;
        while (low<=high) {
            long mid = (low+high)/2;
            if (mid*mid<=x && (mid+1)*(mid+1)>x) {
                ans = mid;
                break;
            } else if (mid*mid < x) {
                low = mid;
            } else if (mid*mid > x) {
                high = mid;
            } else {}
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(sqrt(a));
        scan.close();
    }
}
