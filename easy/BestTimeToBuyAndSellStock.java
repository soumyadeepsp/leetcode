package easy;

// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing 
// a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. 
// If you cannot achieve any profit, return 0.

// good test case - 7,2,4,1

import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int buy_price = prices[0];
        int max_profit = 0;
        for (int i=1; i<prices.length; i++) {
            if (prices[i] < buy_price) {
                buy_price = prices[i];
            }
            if (prices[i] > buy_price) {
                int profit = prices[i] - buy_price;
                if (profit > max_profit) {
                    max_profit = profit;
                }
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        maxProfit(arr);
        scan.close();
    }
}
