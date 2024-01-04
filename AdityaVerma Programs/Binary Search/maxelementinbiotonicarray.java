//// maxelementinbitonic array == peakelement
// Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.
// Note: If the array is increasing then just print the last element will be the maximum value.

// Example 1:

// Input: 
// n = 9
// arr[] = {1,15,25,45,42,21,17,12,11}
// Output: 45
// Explanation: Maximum element is 45.
//Time - O(N*N) --Worst case
// public class maxelementinbiotonicarray {
//    static  int findMaximum(int[] arr, int n) {
 
//         int high = arr[0];
//         int high_index= 0;
        
//         for(int i=1;i<n;i++){
//             if(arr[i]>high){
//                high=arr[i];
//                 high_index=i;
                
//             }
//         }
//         return high;
     
//      }
//     public static void main(String[] args) {
//         int arr[] = {1,15,25,45,42,21,17,12,11};
//         int n = arr.length;
//         System.out.println(findMaximum(arr, n));
//     }
// }
////////////////////////////////////////////////////////
////Time -O(logN) --Best Approach
public class maxelementinbiotonicarray {
   static int findMaximum(int[] arr, int n) {
        // code here
        
        int start = 0;
        int end = n-1;
        
        int mid = (start + end) / 2;;
        
        while(start < end){
            if(mid == 0){
                return (arr[0] > arr[1]) ? arr[0] : arr[1];
            }
            
            if(mid == n-1){
                return (arr[n-2] > arr[n-1]) ? arr[n-2] : arr[n-1];
            }
            
            if((arr[mid-1] < arr[mid]) && (arr[mid] >= arr[mid+1])){
                break;
            }
            else if((arr[mid-1] < arr[mid])){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            mid = (start + end) / 2;
        }
        
        return arr[mid];
    }
    public static void main(String[] args) {
        int arr[] = {3,5,3,2,0};
        int n = arr.length;
        System.out.println(findMaximum(arr, n));
    }
}
