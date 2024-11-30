// Minimize the Heights II (mediun)

/*
Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.

Examples :

Input: k = 2, arr[] = {1, 5, 8, 10}
Output: 5
Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.The difference between the largest and the smallest is 8-3 = 5.
Input: k = 3, arr[] = {3, 9, 12, 16, 20}
Output: 11
Explanation: The array can be modified as {3+k, 9+k, 12-k, 16-k, 20-k} -> {6, 12, 9, 13, 17}.The difference between the largest and the smallest is 17-6 = 11. 
*/

public class Day9 {
    public static void main(String[] args) {

        Solutionn sl = new Solutionn();

        int arr[] = { 9, 5, 8, 7, 1, 3, 9, 4, 7, 5, 11, 22, 99, 88, 22, 44, 11 };
        System.out.println(sl.getMinDiff(arr, 4));
    }
}

class Solutionn {
    int getMinDiff(int[] arr, int k) {

        int n = arr.length;
        int res = 0;

        merge(arr, 0, n - 1);

        res = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] - k < 0)
                continue;

            int minH = Math.min(arr[0] + k, arr[i] - k);
            int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            res = Math.min(res, maxH - minH);
        }

        return res;
    }

    void merge(int arr[], int s, int e) {

        int m = (e + s) / 2;

        if (s < e) {
            merge(arr, s, m);
            merge(arr, m + 1, e);

            sort(arr, s, e);
        }
    }

    void sort(int[] arr, int s, int e) {
        int m = (e + s) / 2;
        int len1 = (m - s) + 1;
        int len2 = e - m;
        int index = 0;

        int L[] = new int[len1];
        int R[] = new int[len2];

        for (int i = 0; i < len1; i++) {
            L[i] = arr[s + i];
        }
        for (int i = 0; i < len2; i++) {
            R[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0;
        index = s;

        while (i < len1 && j < len2) {
            if (L[i] < R[j]) {
                arr[index++] = L[i++];
            } else {
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
