// Find the largest rectangular area possible in a given histogram where the 
// largest rectangle can be made of a number of contiguous bars whose heights are given in an array. 
// For simplicity, assume that all bars have the same width and the width is 1 unit
// Input: histogram = {6, 2, 5, 4, 5, 1, 6}
// Output: 12

// Input: histogram = {3, 5, 1, 7, 5, 9}
// Output: 15

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
class pair{
    int first;
    int second;
    pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}

public class maximumareahistogram {
  static int[] nsr(int[] arr,int n){
    Stack<pair> s = new Stack<>();
    int[] rs = new int[n];
    int pseudo_index = n;
    for(int i = n-1;i>=0;i--){
       if(s.isEmpty() || s.size() ==0){
        rs[i] = pseudo_index;
       }
       else if(s.size()!=0 && s.peek().first<arr[i]){
        rs[i] = s.peek().second;
       }
       else if(s.size()!=0 && s.peek().first>=arr[i]){
        while(s.size()!=0 && s.peek().first>=arr[i]){
            s.pop();
        }
        if(s.size()==0){
            rs[i]=pseudo_index;
        }else{
            rs[i] = s.peek().second;
        }
       }
       s.push(new pair(arr[i], i));
    }
    //reverse rs
    Collections.reverse(Arrays.asList(rs));
     return rs;
  }

  static int[] nsl(int[] arr,int n){
     Stack<pair> s = new Stack<>();
    int[] ls = new int[n];
    int pseudo_index = -1;
    for(int i = 0;i<n;i++){
       if(s.isEmpty() || s.size() ==0){
        ls[i] = pseudo_index;
       }
       else if(s.size()!=0 && s.peek().first<arr[i]){
        ls[i] = s.peek().second;
       }
       else if(s.size()!=0 && s.peek().first>=arr[i]){
        while(s.size()!=0 && s.peek().first>=arr[i]){
            s.pop();
        }
        if(s.size()==0){
            ls[i]=pseudo_index;
        }else{
            ls[i] = s.peek().second;
        }
       }
       s.push(new pair(arr[i], i));
    }
    return ls;
    
  }


    static void solve(int[] arr, int n){
        int[] width = new int[n];
        int[] area = new int[n];
        int max= Integer.MIN_VALUE;
        int[] right = nsr(arr,n);
        int[] left = nsl(arr,n);
        for(int i =0;i<n;i++){
            width[i] = right[i] -left[i] -1;
        }

        for(int i =0;i<n;i++){
            area[i] = arr[i] * width[i];
            if(area[i]>max){
                max = area[i];
            }
        }
        System.out.println(max);
         
         
           
    }
    public static void main(String[] args) {
        int[] arr ={3, 5, 1, 7, 5, 9};
        int n = arr.length;
        solve(arr,n);
    }
}
