# [Rotate Array(Medium)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/rotate-array-by-n-elements-1587115621)

```java
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        
        int[] temp = new int[arr.length];
        int n = arr.length;
        int t = 0;
        d = d%n;
        
        for(int i = d; i < n; i++){
            temp[t++] = arr[i];
        }
        for(int i = 0; i < d; i++){
            temp[t++] = arr[i];
        }
        
        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }
        
    }
}
```