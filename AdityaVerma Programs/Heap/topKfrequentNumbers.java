// Given a non-empty array nums[] of integers of length N, find the top k elements which have the highest frequency in the array. If two numbers have same frequencies, then the larger number should be given more preference.

// Example 1:

// Input:
// N = 6
// nums = {1,1,1,2,2,3}
// k = 2
// Output: {1, 2}
import java.util.Comparator;
import java.util.HashMap;
//Using priority Queue and HashMap
import java.util.PriorityQueue;

// class Pair implements Comparable {
//     int key;
//     int value;
//     Pair(int key,int value){
//         this.key = key;
//         this.value = value;
//     }
//   public int compareTo(Pair p1,Pair p2){
//     return p1.key -p2.key;
//   }
  
// }
public class topKfrequentNumbers {
    static void solve(int[] arr, int k){
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i:arr){
          map.put(i,map.getOrDefault(i,0)+1);
      }
      int[] new_arr = new int[k];
      PriorityQueue<Integer> pq =  new PriorityQueue<>((a, b) -> (map.get(a) == map.get(b))?
      b-a : map.get(b)-map.get(a));
      
      
      for(int key:map.keySet()){
          pq.add(key);
         if(pq.size()>k){
            pq.poll();
         }
      }
      
      for(int j = 0;j<k;j++){
          new_arr[j] =pq.poll();
      }
     for(int b =0;b<new_arr.length;b++){
      System.out.println(new_arr[b]+" ");
     }
    }
    public static void main(String[] args) {
        int[] arr ={2,2,8};
        int k =2;
        solve(arr,k);
    }
}
