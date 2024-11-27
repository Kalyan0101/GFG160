# [Move All Zeroes to End(Easy)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751)

```java
class Solution {
    void pushZerosToEnd(int[] arr) {
        
        int n = arr.length;
        int count = 0;
        
        for(int i = 0; i < n; i++){
            
            if(arr[i] != 0){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        
    }
}
```