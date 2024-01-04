// Given an array of n integers and a positive number k. We are allowed to take any k integers from the given array. The task is to find the minimum possible value of the difference between maximum and minimum of k numbers.

 

// Example 1:

// Input:
// N=7
// K=3
// arr[] = {10, 100, 300, 200, 1000, 20, 30}
// Output:
// 20
// Explanation:
// 20 is the minimum possible difference 
// between any maximum and minimum of any 
// k numbers.Given k = 3, we get the result 
// 20 by selecting integers {10, 20, 30}.
// max(10, 20, 30) - min(10, 20, 30) = 30 - 10 
// = 20.

import java.util.Arrays;

public class minimumdifferenceamongk {
     static long minDiff(long a[] ,int N,int K)
    {
    
       Arrays.sort(a);
       
       long x=Long.MAX_VALUE;
       int i=0;
       int j=K-1;
       while(i<N&&j<N){
           x=Math.min(x,(a[j]-a[i]));
           i++;
           j++;
       }

       return x;
    }
    public static void main(String[] args) {
        long arr[] = {10, 100, 300, 200, 1000, 20, 30};
        int K=3;
        int N = arr.length;
        System.out.println(minDiff(arr, N, K));
    }
}
