// Given an array arr[] of length N and an integer X, the task is to find the number of subsets with a sum equal to X.

// Examples: 

// Input: arr[] = {1, 2, 3, 3}, X = 6 
// Output: 3 
// All the possible subsets are {1, 2, 3}, 
// {1, 2, 3} and {3, 3}

// Input: arr[] = {1, 1, 1, 1}, X = 1 
// Output: 4 




public class countNumberOfSubsets {
    public static int countSubset(int[] arr,int sum,int n){
        //Base condtiions
        int[][] dp = new int[n+1][sum+1];
        //Initialize with 0 or 1
        // for(int i =0;i<=n;i++){
        //     for(int j=0;j<=sum;j++){
               
        //         if(i == 0){
        //             dp[i][j] = 0;
        //         } 
        //         if(j == 0){
        //             dp[i][j] = 1;
        //         }
        //     }
        // }// OR
        // for(int i =0;i<=n;i++){
        //     dp[i][0] =1;
        // }
        dp[0][0] =1;
        for(int j =1;j<=sum;j++){
            dp[1][j] =0;
        }
    


      for(int i =1;i<=n;i++){
        for(int j = 0;j<=sum;j++){
            if(arr[i-1]<=j){
                dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
            }else{
                dp[i][j] = dp[i-1][j];
            }
        }
      }
      return dp[n][sum];

        
    }
    public static void main(String[] args) {
        int [] arr ={9, 7 ,0 ,3, 9 ,8 ,6, 5 ,7 ,6};
        int sum =31;
        int n = arr.length;
        int result =countSubset(arr,sum,n);
        System.out.println("Count of subsets in array:"+result);
    }
}
