// Given an array a of integers of length n, find the nearest smaller number for every element such that the smaller element is on left side.If no small element present on the left print -1.

// Example 1:

// Input: n = 3
// a = {1, 6, 2}
// Output: -1 1 1
// Explaination: There is no number at the 
// left of 1. Smaller number than 6 and 2 is 1.

import java.util.ArrayList;
import java.util.Stack;

public class  nearestsamllertoleft {
    static void solve(int[] arr,int n){
        Stack<Integer> s = new Stack<>();
        // ArrayList<Integer> list = new ArrayList<>();
        int[] new_arr = new int[arr.length];
        for(int i =0;i<n-1;i++){
            
            if(s.isEmpty() || s.size() ==0){
                  //list.add(-1);
                  new_arr[i] = -1;
            }
            else if(s.size() !=0 && s.peek()<arr[i]){
                //list.add(s.peek());
                new_arr[i] = s.peek();
            }
            else if(s.size()!=0 && s.peek() >=arr[i]){
                while(s.size()!=0 && s.peek() >= arr[i]){
                    s.pop();
                }
                if(s.size()==0){
                    //list.add(-1);
                    new_arr[i] = -1;
                }else{
                    //list.add(s.peek());
                    new_arr[i] = s.peek();
                }
            }
            s.push(i);
        }
       // System.out.println(list);
       for(int i=0;i<new_arr.length;i++){
        System.out.print(new_arr[i]+" ");
       }
    }
    public static void main(String[] args) {
        int[] arr= {1,6,2};
        int n = arr.length;
        solve(arr,n);
    }
}
