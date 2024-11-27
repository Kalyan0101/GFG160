// Move All Zeroes to End(Easy)
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751
/*
Given an array arr[]. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in place.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.

Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.
 */

public class Day2 {
    public static void main(String[] args) {
        
    }
}
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