# [Reverse an Array(Easy)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array)

```java
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        
        int left = 0;
        int right = (arr.length - 1);
        
        while(left < right){
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        
    }
}
```