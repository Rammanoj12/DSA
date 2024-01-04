// Given an array of N elements, where each element is at most K away from its target position, devise an algorithm that sorts in O(N log K) time.

// Examples: 

// Input: arr[] = {6, 5, 3, 2, 8, 10, 9}, K = 3 
// Output: arr[] = {2, 3, 5, 6, 8, 9, 10}
import java.util.*;

//Using priority Queue and arraylist are same
 

// public class sortaKsortedarray{
//     static void solve(int[] arr,int k){
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         ArrayList<Integer> list = new Arraylist<>();
//         for(int i =0;i<arr.length;i++){
//             pq.offer(arr[i]);
//             if(pq.size()>k){
//                 System.out.print(pq.poll()+" ");
//                  list.add(pq.poll);
//             }
//         }

//         while(!pq.isEmpty()){
//            printing priority table
//             System.out.print(pq.poll()+" ");
//                  list.add(pq.poll);
//         }
//          // printing arraylist
//           System.out.print(list);
//     }
//     public static void main(String[] args) {
//         int[] arr ={6,5,3,2,8,10,9};
//         int k =3;
//         solve(arr,k);
//     }
// }





//Using Stack
// public class sortaKsortedarray {
    
//     static void solve(int[] arr, int k){
//         Stack<Integer> s = new Stack<>();
//         for(int i =0;i<arr.length;i++){
           
//             while(s.size()>k && s.peek()>arr[i]){
//                 System.out.print(s.pop()+" ");
                
//             }
//              s.push(arr[i]);
//         }

//         while(!s.isEmpty()){
            
//             System.out.print(s.pop()+" ");
            
//         }
        
        
      
//     }
//     public static void main(String[] args) {
//         int[] arr ={6,5,3,2,8,10,9};
//         int k =3;
//         solve(arr,k);
//     }
// }
