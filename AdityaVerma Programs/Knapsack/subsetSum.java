// Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.
// Example:

// Input:  set[] = {3, 34, 4, 12, 5, 2}, sum = 9
// Output:  True  //There is a subset (4, 5) with sum 9.
//Recursion -- 0(2^N)

// public class subsetSum{
      //   public static  boolean  subsetSum(int[] arr,int sum,int n ){
//         if(sum == 0){
//             return true;
//         }
//            if(n ==0 &&sum !=0){
//             return false;
//            }
//            if(arr[n-1]>sum){
//             return subsetSum(arr, sum, n-1);
//            }else{
//             return subsetSum(arr, sum, n-1)||subsetSum(arr, sum-arr[n-1], n-1);
//            }

//        }
 
//        public static void main(String[] args) {
//           int[] arr ={2,3,7,8,10};
//         int n = arr.length;
//          int sum =11;
//         boolean result = subsetSum(arr,sum,n);
//         System.out.println(result);
//        }
//     }


///////////////////////////////////////////////////////////////////////


//////////////////////////////////////////////////////////////////////
// Subset sum 
// o/p -  True -- {8,3}-- is present in the array
//Tabulation
public class subsetSum{
    static boolean subsetSum(int[] arr,int n,int sum){
        boolean[][] dp = new boolean[n+1][sum+1];
      //     for(int i =0;i<=n;i++){
      //       for(int j=0;j<=sum;j++){
               
      //           if(i == 0){
      //               dp[i][j] = false;
      //           } 
      //               if(j == 0){
      //               dp[i][j] = true;
      //           }
      //       }
      //   }
//////// or
// for(int i =0;i<=n;i++){
//         dp[i][0] =true;
//     }
//prefer this to avoid errors in compilers
dp[0][0] =true;
for(int j =1;j<=sum;j++){
    dp[1][j] =false;
}

            for(int i =1;i<=n;i++){
              for(int j=0;j<=sum;j++){
               if(arr[i-1]<=j){
                    dp[i][j] =  (dp[i-1][j-arr[i-1]] || dp[i-1][j] );
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
          }
          return dp[n][sum];
    }
    public static void main(String[] args) {
        int[] arr ={2,3,7,8,10};
        int sum =11;
        int n = arr.length;
        boolean result = subsetSum(arr,n,sum);
       System.out.println(result);
    }
}
