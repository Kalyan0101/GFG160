// Majority Element II (Medium)
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-vote

/*
 You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 

Note: The answer should be returned in an increasing format.

Examples:

Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
Output: [5, 6]
Explanation: 5 and 6 occur more n/3 times.
Input: arr[] = [1, 2, 3, 4, 5]
Output: []
Explanation: no candidate occur more than n/3 times.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Day6 {

    public static void main(String[] args) {
        
    }
}
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {

        int n = nums.length;
        int goal = (int)n/3;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();


        for(int i = 0; i < n; i++){
            
            if(map.containsKey(nums[i])){
                
                 int temp = map.get(nums[i]) + 1;
                 map.put(nums[i], temp);
                 
            }else{
                map.put(nums[i], 0);
            }
        }
        
        map.forEach((i, v) -> {
            if(v >= goal){
                list.add(i);
            }
        });
        return list;
        
    }
}