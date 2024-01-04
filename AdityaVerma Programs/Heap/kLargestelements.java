//Using priorityQueue

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class kLargestelements{
    static void solve(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] new_arr = new int[k];
        // for(int i: arr){
        //     pq.offer(i);

        //     if(pq.size()>k){
        //         pq.poll();
        //     }
        // }

        for(int i =0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k && pq.peek()<arr[i]){
                pq.poll();
            }
        }
       
        // for(int i =0;i<k;i++){
        //     new_arr[i] = pq.poll();
        // }
         for(int i =0;i<k;i++){
        System.out.print(pq.poll()+" ");
        }
          
        // for(int i =0;i<new_arr.length;i++){
        //    System.out.print(new_arr[i]+" ") ;
        // }
    
            // while(!pq.isEmpty()){
            //     System.out.println(pq.poll());
            // }
        
    }
    public static void main(String[] args) {
        int[] arr ={7,10,4,3,20,15};
        int k =3;
        solve(arr,k);
    }
}










//Using stack
// import java.util.Stack;

// public class kLargestelements {
   
//     static void solve(int[] arr,int k){
//         Stack<Integer> s = new Stack<>();

//         for(int i =0;i< arr.length;i++){
//             while(!s.isEmpty() && s.size()>=k&&s.peek()<arr[i]){
             
//                s.pop();
//             }
//             s.push(arr[i]);
//         }
       
//         //int result = Math.min(s.size(),k);
//          for(int i =0;i<k;i++){
//              System.out.println(s.pop());
//          }
          
        
        
//     }
//     public static void main(String[] args) {
//         int[] arr ={7,10,4,3,20,15};
//         int k =3;
//         solve(arr,k);
//     }
// }
