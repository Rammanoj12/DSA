// The partition problem is to determine whether a given set can be partitioned into two subsets such that the sum of elements in both subsets is the same. 

// Examples: 

// Input: arr[] = {1, 5, 11, 5}
// Output: true 
// The array can be partitioned as {1, 5, 5} and {11}

// Input: arr[] = {1, 5, 3}
// Output: false 
// The array cannot be partitioned into equal sum sets.

//Equal sum partition
//o/p - True
public class equalSumPartition{
       static int subsetSum(int[] arr,int sum,int n){
           
    int[][] dp = new int[n+1][sum+1];
          for(int i =0;i<=n;i++){
            for(int j=0;j<=sum;j++){
               
                if(i == 0){
                    dp[i][j] = 0;
                }
                 if(j == 0){
                    dp[i][j] = 1;
                }
            }
        }
////// or
    // for(int i =0;i<=n;i++){
    //         dp[i][0] =true;
    //     }


            for(int i =1;i<=n;i++){
              for(int j=1;j<=sum;j++){
               if(arr[i-1]<=j){
                    dp[i][j] = Math.max(dp[i-1][j-arr[i-1]] , dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
          }
          return dp[n][sum];
    }
       static int  equalSum(int[] arr,int n){
        int sum =0;
        int result =0;
        for(int i =0;i<n;i++){
            sum+=arr[i];
        }
            if(sum % 2 != 0){
                return 0;
            }
            else if(sum % 2 == 0){
                result = subsetSum(arr, sum/2,n);
            }
            
    return result;
 }
    public static void main(String[] args) {
        int[] arr ={1,5,11,5};
        int n = arr.length;
        int result = equalSum(arr,n);
        System.out.println(result);
    }
}