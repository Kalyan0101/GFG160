// Next Permutation(Medium)
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/next-permutation5226

/* 
 Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 

Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.

Examples:

Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.
Input: arr = [3, 2, 1]
Output: [1, 2, 3]
Explanation: As arr[] is the last permutation, the next permutation is the lowest one.
Input: arr = [3, 4, 2, 5, 1]
Output: [3, 4, 5, 1, 2]
Explanation: The next permutation of the given array is {3, 4, 5, 1, 2}.
*/


public class Day5 {
    public static void main(String[] args) {
        
    }
}
class Solution {
    void nextPermutation(int[] arr) {
        // code here
        
        int n = arr.length;
        int pivot = 0;
        int pivotIndex = 0;
        int i = 0;
        
        for(i = n-1; i > 0; i--){
            
            if(arr[i] > arr[i-1]){
                pivot = arr[i-1];
                pivotIndex = i-1;
                break;
            }
        }
        
        if(i == 0){
            reverse(arr, 0, n-1);
            return;
        }
       
        int k = pivot;
        while(k != 0){
            k++;
            for(int j = pivotIndex+1; j < n; j++){
                if(k == arr[j]){
                    int temp = arr[pivotIndex];
                    arr[pivotIndex] = arr[j];
                    arr[j] = temp;
                    k = 0;
                    break;
                }
            }
        }
        reverse(arr, i, n-1);
    }
    
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
    
}