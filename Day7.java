// Stock Buy and Sell – Multiple Transaction Allowed (Hard)
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/stock-buy-and-sell2615

/*
 The cost of stock on each day is given in an array price[]. Each day you may decide to either buy or sell the stock at price[i], you can even buy and sell the stock on the same day. Find the maximum profit that you can get.

Note: A stock can only be sold if it has been bought previously and multiple stocks cannot be held on any given day.

Examples:

Input: prices[] = [100, 180, 260, 310, 40, 535, 695]
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210. Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655. Maximum Profit = 210 + 655 = 865.

Input: prices[] = [4, 2, 2, 2, 4]
Output: 2
Explanation: Buy the stock on day 3 and sell it on day 4 => 4 – 2 = 2. Maximum Profit = 2.
 */

import java.util.ArrayList;
import java.util.List;

public class Day7 {

    public static void main(String[] args) {
        
    }
}
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        List<Integer> sum = new ArrayList<>();
        
        int n = prices.length;
        int hold = -1;
        int profit = 0;
        int i = 0;
        
        for(i = 0; i < n-1; i++){
            if(hold == -1 && prices[i] < prices[i+1]){
                hold = prices[i];
            }
            
            if(hold != -1 && prices[i] > prices[i+1]){
                sum.add(prices[i] - hold);
                hold = -1;
            }
        }
        if(hold != -1 && i == (n-1)){
            sum.add(prices[i] - hold);
        }
        
        
        for(int k : sum){
            profit += k;
        }
        return profit;
    }
}