// Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search.

// Example 1:

// Input:
// N = 5
// arr[] = {1 2 3 4 5} 
// K = 4
// Output: 3
// Explanation: 4 appears at index 3.
////////////////////////////////////////////////
//     //Ascending order
// public class binarysearch {

//     // static void solve(int[] arr,int k){
//     //     int low =0;
//     //     int high = arr.length-1;
//     //     while(low<=high){
//     //         int mid = low +high-low/2;
//     //         if(arr[mid] == k){
//     //             System.out.println(mid);
//     //             return;
//     //         }else if(k<arr[mid]){
//     //             high =mid-1;
//     //         }else{
//     //             low = mid+1;
//     //         }
            
            
//     //     }
        
//     // }
//     public static void main(String[] args) {
//         int[] arr ={1,2,3,4,5};
//         int k =4;
//         solve(arr,k);
//     }
// }
////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
// Given an array arr[] sorted in decreasing order, and an integer X, the task is to check if X is present in the given array or not. If X is present in the array, print its index ( 0-based indexing). Otherwise, print -1.

// Examples: 

// Input: arr[] = {5, 4, 3, 2, 1}, X = 4
// Output: 1
// Explanation: Element X (= 4) is present at index 1.
// Therefore, the required output is 1.

// Input: arr[] = {10, 8, 2, -9}, X = 5
// Output: -1
// Explanation: Element X (= 5) is not present in the array.
// Therefore, the required output is -1.

public class binarysearch {

    static void solve(int[] arr,int k){
        int low =0;
        int high = arr.length-1;
        while(low<high){
            int mid = low +high-low/2;
            if(arr[mid] == k){
                System.out.println(mid);
                return;
            }else if(k<arr[mid]){
                low =mid+1;
            }else{
                high = mid-1;
            }
            
            
        }
        
    }
    public static void main(String[] args) {
        int[] arr ={5, 4, 3, 2, 1};
        int k =4;
        solve(arr,k);
    }
}