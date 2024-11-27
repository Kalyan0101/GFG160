// Stock Buy and Sell – Max one Transaction Allowed (Easy)
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/buy-stock-2

/*
 Given an array prices[] of length n, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.

Note: Stock must be bought before being sold.

Examples:

Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
Output: 8
Explanation: You can buy the stock on day 2 at price = 1 and sell it on day 5 at price = 9. Hence, the profit is 8.
Input: prices[] = [7, 6, 4, 3, 1]
Output: 0 
Explanation: Here the prices are in decreasing order, hence if we buy any day then we cannot sell it at a greater price. Hence, the answer is 0.
Input: prices[] = [1, 3, 6, 9, 11]
Output: 10 
Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1].
 */

public class Day8 {
    public static void main(String[] args) {

        int prices[] = {};
        int n = prices.length;
        int min = prices[0];
        int profit = 0;
        
        for(int i = 0; i < n; i++){
            
            int temp = prices[i] - min;
            
            if(temp > profit)
                profit = temp;
            
            if(prices[i] < min)
                min = prices[i];
        }
        System.out.println(profit);
    }
}