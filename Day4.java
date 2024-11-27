// Rotate Array(Medium)
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/rotate-array-by-n-elements-1587115621

/*
Given an unsorted array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
Input: arr[] = [7, 3, 9, 1], d = 9
Output: [3, 9, 1, 7]
Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.
*/

public class Day4 {
    public static void main(String[] args) {
        
    }
}
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