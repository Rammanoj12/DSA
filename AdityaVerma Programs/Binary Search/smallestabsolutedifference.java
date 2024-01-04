// Given an array of size N containing positive integers n and a number k,The absolute difference between values at indices i and j is |a[i] a[j]|. There are n*(n-1)/2 such pairs and you have to print the kth smallest absolute difference among all these pairs.
 

// Example 1:

// Input : 
// N = 4
// A[] = {1, 2, 3, 4}
// k = 3
// Output : 
// 1 
// Explanation :
// The possible absolute differences are :
// {1, 2, 3, 1, 2, 1}.
// The 3rd smallest value among these is 1.
import java.util.ArrayList;
import java.util.Collections;

public class smallestabsolutedifference {
    public static long kthDiff(int arr[], int n, int k)
   {
       ArrayList<Integer> list=new ArrayList<Integer>();
       for(int i=0;i<n-1;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               list.add(Math.abs(arr[i]-arr[j]));
           }
       }
       Collections.sort(list);
       return list.get(k-1);
   }
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4};
        int n = A.length;
        int k=3;
       long result =kthDiff(A, n, k);
        System.out.println(result);
    }
}
