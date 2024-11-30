# GFG160 | Geek for Geeks 160 days DSA challenge.

## Day 1

### [Second Largest (Easy)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735)

``` java
class Solution {
    public int getSecondLargest(int[] arr) {        
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

## Day 2
### [Move All Zeroes to End(Easy)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751)

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

## Day 3
### [Reverse an Array(Easy)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array)

```java
class Solution {
    public void reverseArray(int arr[]) {

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
## Day 4
### [Rotate Array(Medium)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/rotate-array-by-n-elements-1587115621)

```java
class Solution {
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
## Day 5
### [Next Permutation(Medium)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/next-permutation5226)

```java
public class Solution {
    void nextPermutation(int[] arr) {

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
```

## Day 6
### [Majority Element II (Medium)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-vote)

```java
class Solution {
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

## Day 7
### [Stock Buy and Sell – Multiple Transaction Allowed (Hard)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/stock-buy-and-sell2615)

```java
class Solution {
    public int maximumProfit(int prices[]) {
        List<Integer> sum = new ArrayList<>();
        
        int n = prices.length;
        int hold = -1;
        int profit = 0;
        int i = 0;
        
        for(i = 0; i < n-1; i++){
            if(hold == -1 && prices[i] < prices[i+1]){
                hold = prices[i];
            }
            
            if(hold != -1 && prices[i] > prices[i+1]){
                sum.add(prices[i] - hold);
                hold = -1;
            }
        }
        if(hold != -1 && i == (n-1)){
            sum.add(prices[i] - hold);
        }
        
        
        for(int k : sum){
            profit += k;
        }
        return profit;
    }
}
```

## Day 8
### [Stock Buy and Sell – Max one Transaction Allowed (Easy)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/buy-stock-2)

```java
class Solution {
    public int maximumProfit(int prices[]) {

        int n = prices.length;
        int min = prices[0];
        int res = 0;
        
        for(int i = 0; i < n; i++){
            
            int temp = prices[i] - min;
            
            if(temp > res)
                res = temp;
            
            if(prices[i] < min)
                min = prices[i];
        }
        return res;
    }
}
```
## Day 9
### [Minimize the Heights II](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/minimize-the-heights3351)
```java 
class Solution {
    int getMinDiff(int[] arr, int k) {

        int n = arr.length;
        int flag = 0;
        int res = 0;
        
        merge(arr, 0, n-1);
        
        res = arr[n-1] - arr[0];
        
        for(int i = 1; i < n; i++){
            
            if(arr[i] - k < 0)
                continue;
            
            int minH = Math.min( arr[0]+k, arr[i]-k );
            int maxH = Math.max( arr[i-1]+k, arr[n-1]-k );
            
            res = Math.min(res, maxH-minH);
        }
        
        return res;
    }
    
    void merge(int arr[], int s, int e){

        int m = (e+s) / 2;
        
        if(s < e){
            merge(arr, s, m);
            merge(arr, m+1, e);

            sort(arr, s, e);
        }
    }
    void sort(int[] arr, int s, int e){
        int m = (e+s) / 2;
        int len1 = (m-s) + 1;
        int len2 = e - m;
        int index = 0;

        int L[] = new int[len1];
        int R[] = new int[len2];
        
        for(int i = 0; i < len1; i++){
            L[i] = arr[s+i];
        }
        for(int i = 0; i < len2; i++){
            R[i] = arr[m+1+i];
        }
        
        int i = 0, j = 0;
        index = s;

        while(i < len1 && j < len2){
            if(L[i] < R[j]){
                arr[index++] = L[i++];
            }else{
                arr[index++] = R[j++];
            }
        }
        while (i < len1) {
            arr[index++] = L[i++];
        }
        while (j < len2) {
            arr[index++] = R[j++];
        }
    }
}
```