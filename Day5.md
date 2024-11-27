# [Next Permutation(Medium)](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/next-permutation5226)

```javaclass Solution {
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
```