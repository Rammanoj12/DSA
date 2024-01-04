//max sum sub-array of size k

public class slidingWindow {
    static void maxSubarray(int[] arr,int k){
        int l = arr.length;
        int currSum= 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0;i<k;i++){
           currSum+=arr[i];
        }

        for(int i =k ;i<l;i++){
            currSum = currSum - arr[i-k]+arr[i];
            maxSum = Math.max(maxSum,currSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int[] arr= {2,5,1,8,2,9,1};
        int k=3;
        maxSubarray(arr,k);
    }
    
}


// class Solution{
//     static long maximumSumSubarray(int k, ArrayList<Integer> arr,int n){
//         if(n < k) return 0;
//         long max = 0;
//         long total = 0;
        
//         for(int i = 0; i < k; i++) {
//             total += arr.get(i);
//         }
//         max = total;
        
//         for(int i = k; i < n; i++) {
//             total += arr.get(i) - arr.get(i - k);
//             max = Math.max(max, total);
//         }
        
//         return max;
//     }
// }