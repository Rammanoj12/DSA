// Given an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.

// Example 1:

// Input:
// N = 9, K = 3
// arr[] = 1 2 3 1 4 5 2 3 6
// Output: 
// 3 3 4 5 5 5 6 
// Explanation: 
// 1st contiguous subarray = {1 2 3} Max = 3
// 2nd contiguous subarray = {2 3 1} Max = 3
// 3rd contiguous subarray = {3 1 4} Max = 4
// 4th contiguous subarray = {1 4 5} Max = 5
// 5th contiguous subarray = {4 5 2} Max = 5
// 6th contiguous subarray = {5 2 3} Max = 5
// 7th contiguous subarray = {2 3 6} Max = 6
import java.util.*;
public class maximumofallsubarraysofsizek{
    static void solve(int[] arr,int k,int size){
     ArrayList<Integer> list = new ArrayList<>();
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(b, a));
      int i =0,j=0;
      while(j<size){
        pq.add(arr[j]);
        if(j-i+1<k){
            j++;
        }else if(j-i+1 == k){
            list.add(pq.peek());
            pq.remove(arr[i]);
            i++;
            j++;
        }
      }
  System.out.print(list);

    }
    public static void main(String[] args) {
         int[] arr={1,2,3,1,4,5,2,3,6};
        int k =3;
        int size = arr.length;
        solve(arr,k,size);
    }
}




















///Naive approach-
// public class maximumofallsubarraysofsizek {
//     static void solve(int[] arr,int k,int size){
//         
//         Arrays.sort(arr);
//         int max = Integer.MIN_VALUE;
//         for(int i =0;i<size-k;i++){
//           for(int j =i;j<=i+k;j++){
//              max= Math.max(arr[j],max);
//           }
//         }
//         System.out.println(max);
//     }
//     public static void main(String[] args) {
//         int[] arr={1,2,3,1,4,5,2,3,6};
//         int k =3;
//         int size = arr.length;
//         solve(arr,k,size);
//     }
// }
