import java.util.Scanner;

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            if (price < minPrice) {
                minPrice = price; // Update minimum price
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}

public class BuyandSell {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter n value:");
        int n = S.nextInt();
        System.out.println("enter array elements");
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = S.nextInt();
        }
        Solution sol = new Solution();
        System.out.println("Max Profit: " + sol.maxProfit(prices));
        S.close();
    }
}