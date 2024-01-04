// Given an array, print the Next Smaller Element (NSE) for every element. The NSE for an element x is the first smaller element on the right side of x in the array. Elements for which no smaller element exist (on the right side), consider NSE as -1. 

// Examples: 

// Input: [4, 8, 5, 2, 25]
// Output: [2, 5, 2, -1, -1]
// Explanation:
// The first element smaller than 4 having index > 0 is 2.
// The first element smaller than 8 having index > 1 is 5.
// The first element smaller than 5 having index > 2 is 2.
// There are no elements smaller than 4 having index > 3.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
public class nearestsamllertoright{static void solve(int[] arr,int n){
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =n-1;i>=0;i--){
            if(s.isEmpty() || s.size() ==0){
                  list.add(-1);
            }
            else if(s.size() !=0 && s.peek()<arr[i]){
                list.add(s.peek());
            }
            else if(s.size()!=0 && s.peek() >=arr[i]){
                while(s.size()!=0 && s.peek() >= arr[i]){
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
        int[] arr= {6,2,5,4,5,1,6};
        int n = arr.length;
        solve(arr,n);
    }
}

