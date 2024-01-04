// Given a random set of numbers, Print them in sorted order.

// Example 1:

// Input:
// N = 4
// arr[] = {1, 5, 3, 2}
// Output: {1, 2, 3, 5}
// Explanation: After sorting array will 
// be like {1, 2, 3, 5}.

import java.util.ArrayList;

public class sortanarray {
    static ArrayList<Integer> insert(ArrayList<Integer>list,int temp){
        if(list.size() == 0 || list.get(list.size()-1)<=temp){
            list.add(temp);
            return list;
        }
        int val = list.get(list.size()-1);
        list.remove(list.size()-1);
        list=insert(list,temp);
        list.add(val);
        return list;

    }
    static  ArrayList<Integer> sort(ArrayList<Integer> list,int n){
         if(list.size()==1){
          return list;
         }

         int temp = list.get(list.size()-1);
         list.remove(list.size()-1);

        list =sort(list,n);
       list=insert(list,temp);
         return list;   

        
    }
    public static void main(String[] args) {
        int[] arr ={1,5,3,2};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i= 0;i<n;i++){
            list.add(arr[i]);
        }
         ArrayList<Integer> re_list =sort(list,n);
         System.out.println(re_list);
    }
}


//////////////////////////////////////////////////////

//Naive approach
// class Solution 
// { 
//     int[] sortArr(int[] arr, int n) 
//     { 
//         int temp;
//         for(int i = 0;i<n;i++){
//             for(int j = i+1;j<n;j++){
//                 if(arr[i]>arr[j]){
//                      temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;                
                    
//                 }
//             }
//         }
//         return arr;
//     }
// } 
