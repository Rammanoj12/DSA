// Given a sorted array arr[] and a value X, find the k closest elements to X in arr[]. 

// Keep the following points in mind:

// If X is present in the array, then it need not be considered.
// If there are two elements with the same difference with X, the greater element is given priority.
// If sufficient elements are not present on the right side then take elements from left and vice versa.

// Examples: 

// Input: K = 4, X = 35
//        arr[] = {12, 16, 22, 30, 35, 39, 42, 
//                45, 48, 50, 53, 55, 56}
// Output: 30 39 42 45

//using priorityQueue
// Expected Time Complexity: O(logN + K)
// Expected Auxiliary Space: O(1)

// import java.util.Comparator;
// import java.util.PriorityQueue;
// class Pair{
//     int x;
//     int y;
//     Pair(int x, int y){
//         this.x=x;
//         this.y=y;
//     }
//      @Override
//   public String toString() {
//         return "(" + x + ", " + y + ")";
//     }
// }

// class c implements Comparator<Pair>{
//     public int compare(Pair a, Pair b){
//         if(a.x==b.x){
//             return a.y-b.y;
//         }
//         return b.x-a.x;
//     }



// }

// public class kthclosestNumber{
//     static void solve(int[] arr,int k,int x){
//         //using custom comparator
         
//         //PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(Math.abs(b-x)>Math.abs(a-x))?1:-1);
//         PriorityQueue<Pair> pq = new PriorityQueue<>(new c());
//         for(int i =0;i<arr.length;i++){
//               if(arr[i]!=x){
//             pq.add(new Pair(Math.abs(arr[i]-x),arr[i]));
//             if(pq.size()>k){
//                 pq.poll();
//             }
//         }
//         }
//             while(!pq.isEmpty()){
//                 System.out.print(pq.poll()+" ");
//             }

        

//     }
//     public static void main(String[] args) {
//         int[] arr ={5,6,7,8,9};
//         int k =3;
//         int x =7;
//         solve(arr,k,x);
//     }
// }
  




//////////////////////////////////////


//Using Stack
// import java.util.*;
// public class kthclosestNumber {
//     static void solve(int[] arr,int k,int x){
//         Stack<Integer> s = new Stack<>();
//         for(int i =0;i<arr.length;i++){
           
//             while(!s.isEmpty() && Math.abs(s.peek()-x)>Math.abs(arr[i]-x)){
//                 s.pop();
//             }
//            s.push(arr[i]);  
//         }
          
//         for(int i =0;i<k;i++){
//             System.out.print(s.pop()+" ");
//         }

       
//     }
//     public static void main(String[] args) {
//         int[] arr ={5,6,7,8,9};
//         int k =3;
//         int x =7;
//         solve(arr,k,x);
//     }
// }
//////////////////////////
//Using arraylist and collections
import java.util.*;

// public class kthclosestNumber {
//     public static List<Integer> solve(int[] arr, int k, int x) {
//         Queue<Integer> pq = new PriorityQueue<>((a,b)->(Math.abs(a-x)<Math.abs(b-x))?1:-1);
//         List<Integer> result = new ArrayList<>();
//        for(int i =0;i<arr.length;i++){
//             //   if(arr[i]!=x){
//               pq.add(arr[i]);
//             if(pq.size()>k){
//                 pq.poll();
//             }
//         //}
//     }
//         while(!pq.isEmpty()) {
//             result.add(pq.remove());
//         }
//         Collections.sort(result);
//         Collections.reverse(result);
       
    
//      return result;
// }
//         public static void main(String[] args) {
//         int[] arr ={5,6,7,8,9};
//         int k =3;
//         int x =7;
//         List<Integer> a = solve(arr,k,x);
//         System.out.println(a);
//     }
// }
