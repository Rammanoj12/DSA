//Nearly sorted  or Nearly Sorted Algorithm


// Given an array of n elements, where each element is at most k away from its target position, you need to sort the array optimally.

// Example 1:

// Input:
// n = 7, k = 3
// arr[] = {6,5,3,2,8,10,9}
// Output: 2 3 5 6 8 9 10
// Explanation: The sorted array will be
// 2 3 5 6 8 9 10

import java.util.ArrayList;
import java.util.PriorityQueue;

public class nearlysortedarray {
   static  ArrayList <Integer> nearlySorted(int[] arr,int k)
    {
        // your code here
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        ArrayList<Integer>list = new ArrayList<>();
        // if there are less than k + 1 elements present in the array 
        int minCount = Math.min(arr.length, k+1);
        // add first k + 1 items to the min heap
        for (int i=0;i<minCount;i++) {
            pq.add(arr[i]);
        }
        for (int i=k+1;i<arr.length;i++) {
            list.add(pq.poll());
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }
        return list;
        
    }
    public static void main(String[] args) {
       int arr[] = {6,5,3,2,8,10,9};
       int k = 3;
       ArrayList<Integer> result = nearlySorted(arr,k);
       System.out.println(result);
    }
}
