# [Stock Buy and Sell – Max one Transaction Allowed (Easy)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/buy-stock-2)

```java
class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        
        int n = prices.length;
        int min = prices[0];
        int res = 0;
        
        for(int i = 0; i < n; i++){
            
            int temp = prices[i] - min;
            
            if(temp > res)
                res = temp;
            
            if(prices[i] < min)
                min = prices[i];
        }
        return res;
    }
}
```