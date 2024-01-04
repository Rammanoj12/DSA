// Examples: 

// Input: arr[] = {5, 4, 3, 2, 1}, X = 4
// Output: 1
// Explanation: Element X (= 4) is present at index 1.
// Therefore, the required output is 1.

// Input: arr[] = {10, 8, 2, -9}, X = 5
// Output: -1
// Explanation: Element X (= 5) is not present in the array.
// Therefore, the required output is -1.

public class orderagnosticbinarysearch {

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