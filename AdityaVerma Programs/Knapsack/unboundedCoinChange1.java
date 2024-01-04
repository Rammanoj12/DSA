//COIN CHANGE
//COUNT NO OF WAYS

// Given an integer array of coins[ ] of size N representing different types of denominations and an integer sum, the task is to count the number of coins required to make a given value sum.  

// Note: Assume that you have an infinite supply of each type of coin. (Unbounded)

// Examples: 

// Input: sum = 4, coins[] = {1,2,3}, 
// Output: 4
// Explanation: there are four solutions: {1, 1, 1, 1}, {1, 1, 2}, {2, 2}, {1, 3}. 


public class unboundedCoinChange1 {
    public static int coinchange(int[] coins,int n,int sum){
        int[][] dp = new int[n+1][sum+1];
        for(int i =0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i ==0){
                    dp[i][j] = 0;
                }
                if(j==0){
                    dp[i][j] =1;
                }
            }
        }

        // for(int i =0;i<=n;i++){
        //     dp[i][0]=1;
        // }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(coins[i-1]<=j){
                    dp[i][j] = (dp[i][j-coins[i-1]]+dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
  return dp[n][sum];



    }
    public static void main(String[] args) {
        int[] coins ={1,2,3};
        int n = coins.length;
        int sum = 4;
        int result = coinchange(coins,n,sum);
        System.out.println(result);
    }
}
