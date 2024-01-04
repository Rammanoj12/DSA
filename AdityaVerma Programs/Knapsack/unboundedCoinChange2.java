//Number of Coins
//Minimum number of ways

// Given an array coins[] of size N and a target value V, where coins[i] represents the coins of different denominations. 
//You have an infinite supply of each of coins. --Unbounded
//The task is to find minimum number of coins required to make the given value V. If it’s not possible to make a change, print -1.

// Examples:  

// Input: coins[] = {25, 10, 5}, V = 30
// Output: Minimum 2 coins required We can use one coin of 25 cents and one of 5 cents 

// Input: coins[] = {9, 6, 5, 1}, V = 11
// Output: Minimum 2 coins required We can use one coin of 6 cents and 1 coin of 5 cents
public class unboundedCoinChange2 {
    public static int coinchange(int[] coins,int n,int sum){
        int[][]dp = new int[n+1][sum+1];
        //filed 0 and int_max-1
        for(int i =1;i<=n;i++){
           dp[i][0] =0;
        }
       for(int j = 0;j<=sum;j++){
        dp[0][j] = Integer.MAX_VALUE-1;
       }
       
       for(int i =1;i<=n;i++){
        for(int j=1;j<=sum;j++){
            // if(j/coins[0] ==0){
            //     dp[i][j] = j/coins[0];
            // }else{
            //     dp[i][j] = Integer.MAX_VALUE-1;
            // }


            if(coins[i-1]<=j){
                dp[i][j] = Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
            }else{
                dp[i][j] = dp[i-1][j];
            }
        }
       }
        return dp[n][sum];

       
    }
    public static void main(String[] args) {
        int[] coins={25, 10, 50};
        int n = coins.length;
        int sum = 50;
        System.out.println(coinchange(coins,n,sum));
    }
    
}
