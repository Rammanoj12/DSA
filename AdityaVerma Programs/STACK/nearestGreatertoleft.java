// Given an array of integers, find the closest (not considering the distance, but value) greater or the same value on the left of every element. If an element has no greater or same value on the left side, print -1.

// Examples:  

// Input : arr[] = {10, 5, 11, 6, 20, 12} 
// Output : -1, 10, -1, 10, -1, 20 
// The first element has nothing on the left side, so the answer for first is -1. 
// Second, element 5 has 10 on the left, so the answer is 10. 
// Third element 11 has nothing greater or the same, so the answer is -1. 
// Fourth element 6 has 10 as value wise closes, so the answer is 10 
// Similarly, we get values for the fifth and sixth elements.
//NearestGreatertoleft or nearest largest element

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class nearestGreatertoleft {
    static void solve(int[] arr,int n){
      Stack<Integer> s = new Stack<>();
      ArrayList<Integer> list = new ArrayList<>();
      for(int i = 0;i<n;i++){
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
      //Collections.reverse(list);
      System.out.println(list);

    }
    public static void main(String[] args) {
        int[] arr={1,3,2,4};
        int n = arr.length;
        solve(arr,n);
    }
    
}
