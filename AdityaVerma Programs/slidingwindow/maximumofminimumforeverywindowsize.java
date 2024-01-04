// Given an integer array. The task is to find the maximum of the minimum of every window size in the array.
// Note: Window size varies from 1 to the size of the Array.

// Example 1:

// Input:
// N = 7
// arr[] = {10,20,30,50,10,70,30}
// Output: 70 30 20 10 10 10 10 
// Explanation: 
// 1.First element in output
// indicates maximum of minimums of all
// windows of size 1.
// 2.Minimums of windows of size 1 are {10},
//  {20}, {30}, {50},{10}, {70} and {30}. 
//  Maximum of these minimums is 70. 
// 3. Second element in output indicates
// maximum of minimums of all windows of
// size 2. 
// 4. Minimums of windows of size 2
// are {10}, {20}, {30}, {10}, {10}, and
// {30}.
// 5. Maximum of these minimums is 30 
// Third element in output indicates
// maximum of minimums of all windows of
// size 3. 
// 6. Minimums of windows of size 3
// are {10}, {20}, {10}, {10} and {10}.
// 7.Maximum of these minimums is 20. 
// Similarly other elements of output are
// computed.

import java.util.ArrayDeque;
import java.util.ArrayList;

////Time -O(N^2) Space -0(N)
public class maximumofminimumforeverywindowsize {
    static void solve(int[] arr, int size) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int k = 1; k <= size; k++) {
            int maxOfMin = Integer.MIN_VALUE;
            ArrayDeque<Integer> q = new ArrayDeque<>();

            for (int i = 0; i < size; i++) {
                while (!q.isEmpty() && q.peekLast() > arr[i]) {
                    q.pollLast();
                }
                q.addLast(arr[i]);
        
                

                if (i >= k - 1) {
                    maxOfMin = Math.max(maxOfMin, q.peekFirst());
                    if (arr[i - k + 1] == q.peekFirst()) {
                        q.pollFirst();
                    }
                    
                }
               
            }
             result.add(maxOfMin);

            
        }

        System.out.println(result);
    }
   
public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 50, 10, 70, 30 };
        int size= arr.length;
        solve(arr,size);
    }
}


// /////Time -O(N) and space are same
// class Solution {
    
//     static int[] maxOfMin(int[] arr, int n) {
//        int min=arr[0]; //finding min too
        
//        Deque<Integer> ps=new ArrayDeque<>(); //previous smaller element
//        int[] PS=new int[n];
//        for(int i=0;i<n;i++){
//            while(ps.isEmpty()==false && arr[i]<=arr[ps.peek()]){
//                ps.pop();
//            }
//            PS[i]=(ps.isEmpty())?-1:ps.peek();
//            ps.push(i);
           
//            min=Math.min(arr[i],min);
 
//        }
       
//        Deque<Integer> ns=new ArrayDeque<>(); //next smaller element
//        int[] NS=new int[n];
//        for(int i=n-1;i>=0;i--){
//            while(ns.isEmpty()==false && arr[i]<=arr[ns.peek()]){
//                ns.pop();
//            }
//            NS[i]=(ns.isEmpty())? n: ns.peek() ;
//            ns.push(i);
//        }
       
//        int[] res=new int[n];
//        for(int i=0;i<n;i++){
//            int in=NS[i]-PS[i]-1; //in is window size
//            if(res[in-1]<arr[i]){ // as 0th index represent size 1 window size so on
//                res[in-1]=arr[i];//thats why in-1
//            }
//        }
       
//        for(int i=n-1;i>=0;i--){
//            if(res[i]<min){
//                res[i]=min;
//            }
//            else{
//                min=res[i];
//            }
//        }
       
//        return res;
//     }
// }

