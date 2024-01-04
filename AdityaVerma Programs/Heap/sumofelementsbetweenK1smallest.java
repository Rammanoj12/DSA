// Given an array A[] of N positive integers and two positive integers K1 and K2. Find the sum of all elements between K1th and K2th smallest elements of the array. It may be assumed that (1 <= k1 < k2 <= n).

 

// Example 1:

// Input:
// N  = 7
// A[] = {20, 8, 22, 4, 12, 10, 14}
// K1 = 3, K2 = 6
// Output:
// 26
// Explanation:
// 3rd smallest element is 10
// 6th smallest element is 20
// Element between 10 and 20 
// 12,14. Their sum = 26.

import java.util.Collections;
import java.util.PriorityQueue;


public class sumofelementsbetweenK1smallest {
  public static long sumBetweenTwoKth(long A[], long N, long K1, long K2) {
    // Your code goes here
    PriorityQueue<Long> pq = new PriorityQueue<>();
    for (int i = 0; i < N; i++) {
      pq.add(A[i]);
    }
    long ans = 0;
    int i = 1;
    int j = 1;
    while (j < K2) {
      if (i > K1) {
        ans += pq.peek();
        // System.out.println(pq.peek());
      }
      pq.poll();
      i++;
      j++;
    }
    return ans;
  }
}

// public class sumofelementsbetweenK1smallest {
//       static int calculate(int[] arr,int a){
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         for(int i=0;i<arr.length;i++){
//             pq.add(arr[i]);
//                 if(pq.size()>a){
//             pq.poll();
        
//         }
         
//         }
       
//        return pq.poll();
//       }
//     static void solve(int[] arr){
//         int sum =0;
//         int k1 = 3;
//         int k2 = 6;
//         int first = calculate(arr,k1);
//         int second = calculate(arr,k2);
//         for(int i =0;i<arr.length;i++){
//             if(arr[i]>first && arr[i]<second){
//                 sum+=arr[i];
//             }
//         }
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         int[] arr= {1,3,12,5,15,11};
        
//         solve(arr);
//     }
// }
