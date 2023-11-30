import java.util.*;

// You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
// Once you pay the cost, you can either climb one or two steps.
// You can either start from the step with index 0, or the step with index 1.
// Return the minimum cost to reach the top of the floor.

public class MinCostClimbingStairs {
    public static int[] dp;
    public static int minCostClimbingStairsHelper(int[] cost, int low, int high) {
        if (low==high) {
            return cost[low];
        }
        if (low>high) {
            return 0;
        }
        if (dp[low]!=-1) {
            return dp[low];
        }
        int smallerProblem1 = cost[low] + minCostClimbingStairsHelper(cost, low+1, high);
        int smallerProblem2 = cost[low] + minCostClimbingStairsHelper(cost, low+2, high);
        int biggerProblem = Math.min(smallerProblem1, smallerProblem2);
        dp[low] = biggerProblem;
        return biggerProblem;
    }
    public static int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length+1];
        for (int i=0; i<dp.length; i++) {
            dp[i] = -1;
        }
        int smallerProblem1 = minCostClimbingStairsHelper(cost, 0, cost.length-1);
        int smallerProblem2 = minCostClimbingStairsHelper(cost, 1, cost.length-1);
        return Math.min(smallerProblem1, smallerProblem2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}