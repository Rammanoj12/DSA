// Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.


// Example 1:

// Input:
// nums = {2, 8, 5, 4}
// Output:
// 1
// Explanation:
// swap 8 with 4.

import java.util.Arrays;
import java.util.HashMap;

public class minimumswapstosort {
    static void swap(int[] nums,int n){
      
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
        }
    
      Arrays.sort(temp);
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<n;i++){
          map.put(nums[i],i);
      }
      int swap=0;
      for(int i=0;i<n;i++){
          if(temp[i]!=nums[i]){
              swap++;
             
            int idx=  map.get(temp[i]);
            int data=nums[i];
            nums[i]=temp[i];
            nums[idx]=data;
             map.put(data,idx);
           
          }



      }

      

      System.out.println(swap);
    //   for(int key:map.keySet()){
    //     System.out.println(key +" "+map.get(key));
    //   }
      
    }

    public static void main(String[] args) {
        int[] arr={2, 8, 5, 4};
        int size = arr.length;
        swap(arr,size);
    }
}
