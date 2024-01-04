import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// public class subarraywithgivensum {
//     public static void main(String[] args) {
// Given an unsorted array A of size N that contains only positive integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.

// In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.

// Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.

// Example 1:

// Input:
// N = 5, S = 12
// A[] = {1,2,3,7,5}
// Output: 2 4
// Explanation: The sum of elements 
// from 2nd position to 4th position 
// is 12.




// class Solution
// {
//     //Function to find a continuous sub-array which adds up to a given number.
//     static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    
//     {
//         ArrayList<Integer> list = new ArrayList<>();
//         int curr_sum =0 ,start =0,end=0;
        
        
//         while(end<arr.length){
//             curr_sum+=arr[end];
//             while(curr_sum>s){
//                 curr_sum -= arr[start];
//                 start++;
//             }
//             if(curr_sum == s && start <= end){
//                 list.add(end+1);
//                 return list;
//                 //return new ArrayList<Integer>(Arrays.asList(start+1,end+1));
//             }
//             end++;
           
            
//         }
//         list.add(-1);
//         return list;
//         // return  new ArrayList<Integer>(Arrays.asList(-1));
       
       
       
//     }
// }

/// With hashmap and arraylist
// class Solution
// {
//     //Function to find a continuous sub-array which adds up to a given number.
//     static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
//     {
//      ArrayList<Integer> res=new ArrayList<>();
//         Map<Integer,Integer> temp=new HashMap<>();
//         temp.put(0,0);
//       int sum=0;
//       for(int i=0;i<n;i++)
//       {
//           sum+=arr[i];
          
//         if(temp.containsKey(sum-s)) 
//         {

            
//             res.add(temp.get(sum-s)+1);
//             res.add(i+1);
//             return res;
            
//         }
        
//         temp.put(sum,i+1);
          
//       }
//         res.add(-1);
//         return res;
    
     
//     }
// }

//     }
// }
/////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////
///SLIDING WINDOW WHICH RETURNS MAX SUM OF SUBARRAY WITH SIZE - K

// //max sum sub-array of size k
// //input-
// //  int[] arr= {1,2,-1,5,6,9};
// // int k=3;
// //ouput - 20

// public class slidingWindow {
//     static void maxSubarray(int[] arr,int k){
//         int l = arr.length;
//         int currSum= 0;
//         int maxSum = Integer.MIN_VALUE;

//         for(int i =0;i<k;i++){
//            currSum+=arr[i];
//         }

//         for(int i =k ;i<l;i++){
//             currSum = currSum - arr[i-k]+arr[i];
//             maxSum = Math.max(maxSum,currSum);
//         }
//         System.out.println(maxSum);
//     }
//     public static void main(String[] args) {
//         int[] arr= {1,2,-1,5,6,9};
//         int k=3;
//         maxSubarray(arr,k);
//     }
    
// }
////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////////
//Subarray sum equal to k -- return numbers of sub arrays
//output --  3 means 3 subarrays are equal to k
//{10,2,-2,-20,10} = -10;
//{-20,10} = -10;
//{10,2,-2,-20} = -10
///Total Three
// public class subarraywithgivensum{
//     public static void main(String[] args) {
//         int[] arr ={10,2,-2,-20,10};
//         int k = -10;
//         HashMap<Integer,Integer> map = new HashMap<>();
//         map.put(0,1);
//         int ans =0;
//         int sum =0;
//         for(int i=0;i<arr.length;i++){
//             sum+=arr[i];
//             if(map.containsKey(sum-k)){
//                 ans+=map.get(sum-k);
//             }
//             if(map.containsKey(sum)){
//                 map.put(sum,map.get(sum)+1);
//             }else{
//                 map.put(sum,1);
//             }
//         }
//         System.out.println(ans);
        
//     }
// }