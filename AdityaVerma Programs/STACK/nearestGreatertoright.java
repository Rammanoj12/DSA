// Given an array, print the Next Greater Element (NGE) for every element. 

// The Next greater Element for an element x is the first greater element on the right side of x in the array. Elements for which no greater element exist, consider the next greater element as -1. 

// Example: 

// Input: arr[] = [ 4 , 5 , 2 , 25 ]
// Output:  4      –>   5
//                5      –>   25
//                2      –>   25
//               25     –>   -1
// Explanation: except 25 
import java.util.*;
public class nearestGreatertoright {
   static void solve(int[] arr,int n){
      Stack<Integer> s = new Stack<>();
      ArrayList<Integer> list = new ArrayList<>();
      for(int i = n-1;i>=0;i--){
        if(s.isEmpty() || s.size()==0){
            list.add(-1);
        }
        else if(s.size()!=0 && s.peek()>arr[i]){
            list.add(s.peek());
        }else if(s.size()!=0 && s.peek()<=arr[i]){
            while(s.size()!=0 && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.size()==0){
                list.add(-1);
            }else{
                list.add(s.peek());
            }
        }
            s.push(arr[i]);
        
        
      }
      Collections.reverse(list);
      System.out.println(list);

    }
    public static void main(String[] args) {
        int[] arr={1,3,0,0,1,2,4};
        int n = arr.length;
        solve(arr,n);
    }
    
}

// optimised code
// public static long[] nextLargerElement(long[] arr, int n) { 
//         // Your code here
//         Stack<Long>s=new Stack<>();
//         long[] li=new long[arr.length];
//         for(int i=arr.length-1;i>=0;i--){
//             while(!s.isEmpty() && s.peek()<arr[i]){
//                 s.pop();
//             }
//             if(!s.isEmpty()){
//                 li[i]=s.peek();
//             }
//             else{
//                 li[i]=-1;
//             }
//             s.push(arr[i]);
//         }
//         return li;
//     } 