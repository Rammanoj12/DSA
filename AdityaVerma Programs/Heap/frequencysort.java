// Print the elements of an array in the decreasing frequency if 2 numbers have the same frequency then print the one which came first

// Examples:  

// Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
// Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

// Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
// Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}
////////////////////////////////////////
// //Descending order output

import java.util.HashMap;
import java.util.PriorityQueue;
public class frequencysort {
    static void solve(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key : arr){
            // if(map.containsKey(key)){
            //     map.put(key,map.getOrDefault(key, 0)+1);
            // }else{
            //     map.put(key,1);
            // }
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));
        for(int keys:arr){
            pq.add(keys);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] result = new int[k];
        //int ptr=0;
        // while(pq.size()>0){
        //  result[ptr++] = pq.poll();
        // }
        for(int j =0 ;j<k;j++){
            result[j] = pq.poll();
        }

        for(int i =0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,1,1,3,2,2,4};
        int k =2;
        solve(arr,k);
    }
}
















////////////////////////////////////////////////////////
// //Ascending order output
// import java.util.HashMap;
// import java.util.PriorityQueue;
// public class frequencysort {
//     static void solve(int[] arr, int k){
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int key : arr){
//             // if(map.containsKey(key)){
//             //     map.put(key,map.getOrDefault(key, 0)+1);
//             // }else{
//             //     map.put(key,1);
//             // }
//             if(map.containsKey(key)){
//                 map.put(key,map.get(key)+1);
//             }else{
//                 map.put(key,1);
//             }
//         }
//         PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));
//         for(int keys:arr){
//             pq.add(keys);

//         }
//         int[] result = new int[k];
//         //int ptr=0;
//         // while(pq.size()>0){
//         //  result[ptr++] = pq.poll();
//         // }
//         for(int j =0 ;j<k;j++){
//             result[j] = pq.poll();
//         }

//         for(int i =0;i<result.length;i++){
//             System.out.println(result[i]);
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr ={1,1,1,3,2,2,4};
//         int k =2;
//         solve(arr,k);
//     }
// }
