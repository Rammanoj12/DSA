// Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. Expected time complexity is O(Logn) 

// Examples: 
//   Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
//   Output: 4 // x (or 2) occurs 4 times in arr[]
//   Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
//   Output: 1 
//   Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
//   Output: 2 
//   Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
//   Output: -1 // 4 doesn't occur in arr[] 
public class countofanelementinsortedarray {
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
       int arr[] = {1, 1, 2, 2, 2, 2, 3};
       int x =2;
       int first = solve(arr,x,0);
       int last = solve(arr,x,1);
       int result = last-first+1;
       System.out.println(result);

    }
}
