

import java.util.Scanner;

public class ClimbStairs {
    public static int[] dp = new int[46];
    public static int climbStairs(int n) {
        if (n==1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        if (dp[n]!=0) {
            return dp[n];
        }
        int answer = climbStairs(n-1)+climbStairs(n-2);
        dp[n] = answer;
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(climbStairs(a));
        scan.close();
    }
}
