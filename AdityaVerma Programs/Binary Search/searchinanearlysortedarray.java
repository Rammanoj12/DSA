// Given a sorted array arr[] of size N, some elements of array are moved to either of the adjacent positions, i.e., arr[i] may be present at arr[i+1] or arr[i-1] i.e. arr[i] can only be swapped with either arr[i+1] or arr[i-1]. The task is to search for an element in this array.

// Examples : 

// Input: arr[] =  {10, 3, 40, 20, 50, 80, 70}, key = 40
// Output: 2 
// Explanation: Output is index of 40 in given array i.e. 

public class searchinanearlysortedarray {
    static int solve(int[] arr,int k){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (mid - 1 >= start && arr[mid - 1] == k) {
                return mid - 1;
            } else if (mid + 1 <= end && arr[mid + 1] == k) {
                return mid + 1;
            } else if (arr[mid] > k) {
                end = mid - 2;
            } else {
                start = mid + 2;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr ={5,10,30,20,40};
        int k =30;
       System.out.println(solve(arr,k));
    }
}


