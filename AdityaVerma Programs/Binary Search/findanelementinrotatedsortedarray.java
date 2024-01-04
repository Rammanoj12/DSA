// // Given a sorted and rotated array A of N distinct elements which is rotated at some point, and given an element key. The task is to find the index of the given element key in the array A. The whole array A is given as the range to search.

// // Example 1:

// // Input:
// // N = 9
// // A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}
// // key = 10
// // l = 0 , h = 8
// // Output:
// // 5
// // Explanation: 10 is found at index 5.

// public class findanelementinrotatedsortedarray {

//     static int binarySearch(int[] arr, int low, int high, int key) {
//         while (low <= high) {
//             int mid = low + (high - low) / 2;

//             if (arr[mid] == key) {
//                 return mid;
//             }

//             // Check if the left half is sorted
//             if (arr[low] <= arr[mid]) {
//                 if (arr[low] <= key && key < arr[mid]) {
//                     high = mid - 1;
//                 } else {
//                     low = mid + 1;
//                 }
//             } else {  // If the right half is sorted
//                 if (arr[mid] < key && key <= arr[high]) {
//                     low = mid + 1;
//                 } else {
//                     high = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }

//     static int solve(int[] arr, int key) {
//         int low = 0;
//         int high = arr.length - 1;

//         return binarySearch(arr, low, high, key);
//     }

//     public static void main(String[] args) {
//         int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
//         int key = 10;
//         System.out.println(solve(arr, key));
//     }
// }
//////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////
////General approach
class Solution {
    public int search(int[] nums, int target) {
        int arrayStartIndex = findRotation(nums);
        int index= binarySearch(nums, arrayStartIndex,nums.length-1,target);
        int index2 = binarySearch(nums, 0,arrayStartIndex-1,target);
        return index==-1?index2:index;
    }
    
    public int findRotation(int [] arr){
        int N = arr.length;
        int start = 0,end = N-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            int prev = (mid - 1 + N)%N;
            int next = (mid + 1)%N;
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next])
                return mid;
            else if(arr[mid]>=arr[0])
                start = mid+1;
            else 
                end = mid-1;
        }
        return 0;
    }
    
    public int binarySearch(int [] arr,int start , int end,int target){
        
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid]>=target)
                end = mid-1;
            else
                start = mid + 1;
        }
        return -1;
    }
}