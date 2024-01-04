// Given an array arr[ ] of length N consisting cost of N toys and an integer K depicting the amount with you. Your task is to find maximum number of toys you can buy with K amount. 

// Example 1:

// Input: 
// N = 7 
// K = 50
// arr[] = {1, 12, 5, 111, 200, 1000, 10}
// Output: 4
// Explaination: The costs of the toys 
// you can buy are 1, 12, 5 and 10.

import java.util.PriorityQueue;
import java.util.*;
public class maximizeToys {
   static int count  =0;
    static void solve(int[] arr,int k){
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] new_arr = new int[arr.length];
        
        for(int i :arr){
            pq.add(i);
        }
        for(int i =0;i<arr.length;i++){
            arr[i] =pq.poll();
        }
        //By Arrays.sort() method or else PriorityQueue
        //Arrays.sort(arr);
        for(int i =0;i<arr.length;i++){
            if(arr[i]<k){
                new_arr[i] =arr[i];
                count++;

                k = k-arr[i];
            }
        }
        System.out.print("Specific toys are :");
        for(int i =0;i<count;i++){
            System.out.print(new_arr[i]+"  ");
        }
        System.out.println();
       System.out.println("Total number of toys:"+" "+count);
    }
    public static void main(String[] args) {
        int[] arr = {1, 12, 5, 111, 200, 1000, 10};
        int k = 50;
        solve(arr,k);
    }
}
