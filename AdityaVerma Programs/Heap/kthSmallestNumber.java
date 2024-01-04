// Given an array arr[] of size N and a number K, where K is smaller than the size of the array. Find the K’th smallest element in the given array. Given that all array elements are distinct.

// Examples:  

// Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
// Output: 7

// Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
// Output: 10 

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

//Using priorityQueue


public class kthSmallestNumber {
    static void solve(int[] arr, int k) {
        
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
             PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            //pq.add(arr[i]);
            pq.offer(-arr[i]);

           
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int first = -pq.peek();
        System.out.println(first);
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        solve(arr, k);
    }
}


//Using stack
// public class kthSmallestNumber {
//     static void solve(int[] arr,int k){

    
//     Stack<Integer> s = new Stack<>();

//     for(int i =0;i<arr.length;i++){
//         s.push(arr[i]);
//           while(!s.isEmpty() && s.size()>k){
//                  s.pop();
//           }
          
     
     
//     }
//     int result = 0;
//     while (!s.isEmpty()) {
//         result = s.pop();
        
//     }
//     System.out.println(result);
   
    
//     }
//     public static void main(String[] args) {
//         int[]   arr ={7,10,4,3,20,15};
//         int k = 3;
//         solve(arr,k);                                                                                                                                                                      
//     }
    
// }
