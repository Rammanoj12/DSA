// Given a sorted array arr containing n elements with possibly some duplicate, the task is to find the first and last occurrences of an element x in the given array.
// Note: If the number x is not found in the array then return both the indices as -1.


// Example 1:

// Input:
// n=9, x=5
// arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
// Output:  
// 2 5
// Explanation: 
// First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5. 
public class firstandlastoccurenceinasortedarray {
   
    static int solve(int[] arr,int k,int p){
        int low =0;
        int high =arr.length-1;
        int result = -1;
        while(low<=high){
            int mid = low +high-low/2;
            if(arr[mid] == k){
                result = mid;
               if(p==0){
                high = mid-1;
               }else{
                low = mid+1;
               }
               
            }else if(k<arr[mid]){
               high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
       int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
       int k =5;
        int first = solve(arr,k,0);
    int last = solve(arr,k,1);
    System.out.println(first+" "+last);
    }
}
