# [Second Largest (Easy)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735)

``` java
class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        
        int n = arr.length;
        int f = 0, s = 0;
        
        if(n == 1)
            return -1;
            
        
            
        for(int i = 0; i < n; i++){
            if(arr[i] > f){
                s = f;
                f = arr[i];
            }else{
                if(arr[i] > s && arr[i] != f){
                    s = arr[i];
                }
            }
        }
        
        if(s > 0)
            return s;
        
        return -1;        
    }
}
```