// Given a sorted array arr[] of size N without duplicates, and given a value x. Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x. Find the index of K(0-based indexing).

// Example 1:

// Input:
// N = 7, x = 0 
// arr[] = {1,2,8,10,11,12,19}
// Output: -1
// Explanation: No element less 
// than 0 is found. So output 
// is "-1".
public class floorofanelement {
  static int solve(int[] arr,int k){
    int low=0;
    int high = arr.length-1;
    int res =-1;
    while (low<=high) {
        int mid = low+(high-low)/2;
        if(arr[mid] == k){
          return mid;
        }else if(arr[mid]<=k){
            res=mid;
            low = mid+1;
        }else{
            high = mid-1;
        }
        
    }
    return res;
  }
    public static void main(String[] args) {
        int arr[] = {1,2,8,10,11,12,19};
        int k =5;
        System.out.println(solve(arr,k));
    }
}
