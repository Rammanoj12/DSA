//Variable
// Given an array containing N positive integers and an integer K. Your task is to find the length of the longest Sub-Array with sum of the elements equal to the given value K.

// For Input:
// 1
// 7 5
// 4 1 1 1 2 3 5
// your output is: 
// 4 . 

// Q. Will the discussed approach work with negative numbers in the array?
// Ans. It won't work because 'j' is not further incremented, 
//so there is always the possibility that -ve number might be present in the array that will again make the value that of sum, so we are not covering that possibility.
// Below is code for the negative number using HashMap in O(n) time complexity:-
//This is for only positive numbers
// public class longestsubarraywithsumk {
//     static void solve(int[] arr,int k ,int size){
//         int max= Integer.MIN_VALUE;
//         int sum =0 ;
//         int i =0,j=0;
//         while(j<size){
//             sum+=arr[j];
//             if(sum<k){
//                 j++;
//             }else if(sum == k){
//                 if(j-i+1>max){
//                     max = j-i+1;
//                 }
//                 j++;
//             }else if(sum >k){
//                 while(sum>k){
//                     sum-=arr[i];
//                    i++; 
//                 }
//                 j++;
//             }
            
//         }
//         System.out.println(max);
//     }
//     public static void main(String[] args) {
//         int[] arr={4,1,1,1,2,3,5};
//         int  k =5;
//         int size = arr.length;
//         solve(arr,k,size);
//     }
// }
//This is for  negative and postive numbers using hashmap
import java.util.*;
public class longestsubarraywithsumk{
    public static void main(String[] args) {
        int[] arr ={1, 4, 3, 3 ,5, 5};
        int k = 16;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        //map.put(0,1);
        int sum=0;
        int max= Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
              max=Math.max(max,i+1);  
            } 
            if(map.containsKey(sum-k)){
                max = Math.max(max,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
           
        }
         if(max==Integer.MIN_VALUE){
             System.out.println("Wrong");
         }
         
             
        
    System.out.println(max);
    }
}