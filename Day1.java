// Second Largest (Easy)
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735
/*
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:
Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
*/

public class Day1 {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] arr = {1,2,3,9,5,4,2,8,7};

        System.out.println(sl.getSecondLargest(arr));
    }
}

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