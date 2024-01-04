// Given an ascending sorted rotated array Arr of distinct integers of size N. The array is right rotated K times. Find the value of K.

// Example 1:

// Input:
// N = 5
// Arr[] = {5, 1, 2, 3, 4}
// Output: 1
// Explanation: The given array is 5 1 2 3 4. 
// The original sorted array is 1 2 3 4 5. 
// We can see that the array was rotated 
// 1 times to the right.
public class rotationtimes {
    static int solve(int[] arr){
        int low =0;
        int high= arr.length-1;
       
        
        while(low<=high){
          
            int mid = low +(high-low)/2;
            int prev = (mid-1+arr.length)%arr.length;
            int next = (mid+1)%arr.length;
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
                return mid;
            }else if(arr[low]<=arr[high]){
                return low;
            }else if(arr[low]<=arr[mid]){
                low=mid+1;
            }else if(arr[mid]<=arr[high]){
                high = mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {11,12,15,18,2,5,6,8};
        System.out.println(solve(arr));
    }
}
