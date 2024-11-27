# [Stock Buy and Sell – Multiple Transaction Allowed (Hard)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/stock-buy-and-sell2615)

```java
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
```