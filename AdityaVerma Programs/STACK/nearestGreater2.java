// Given a circular integer array arr of size N (i.e ., the next element of arr [N-1] is arr[0] ), return the next greater number for every element in arr.
// The next greater element of a number x is the first greater number to its traversing order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.
 

// Example 1:

// Input:
// N = 3
// arr[ ] = {1, 2, 1}
// Output: {2, -1, 2}
// Explanation: The first 1's next greater number is 2:
// The number 2 can't find next greater number.
// The second 1's next greater number needs to search circularly, which is also 2.
//nearest greater element but with circular integer array

import java.util.ArrayList;
import java.util.Stack;

public class nearestGreater2 {
    static void solve(int[] arr, int n){
        Stack<Integer>s = new Stack<>();
        //ArrayList<Integer> list = new ArrayList<>();
        int[] new_arr = new int[n];
        for(int i =2*n-1;i>=0;i--){
            while(!s.isEmpty()&&s.peek()<=arr[i%n]){
                s.pop();
            }
            if(i<n){
                if(!s.isEmpty()){
                    //list.add(s.peek());
                    new_arr[i] = s.peek();
                }else{
                    //list.add(-1);
                    new_arr[i] =-1;
                }
            }
            s.push(arr[i%n]);
        }
    
       // System.out.println(list);
        for(int i =0;i<new_arr.length;i++){
            System.out.print(new_arr[i]+"  ");
        }

    }
    public static void main(String[] args) {
       int[] arr= {1, 2, 1};
       int  n = arr.length;
       solve(arr,n);
    }
}
