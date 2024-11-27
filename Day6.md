# [Majority Element II (Medium)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-vote)

```java
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
```