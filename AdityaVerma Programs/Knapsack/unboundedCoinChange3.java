//MIN COIN
// Given a list of coins of distinct denominations and total amount of money. Find the minimum number of coins required to make up that amount. Output -1 if that money cannot be made up using given coins.
// You may assume that there are infinite numbers of coins of each type.
 

// Example 1:

// Input: arr = [1, 2, 5], amount = 11
// Output: 3
// Explanation: 2*5 + 1 = 11. So taking 2 
// denominations of 5 and 1 denomination of  
// 1, one can make 11.

public class unboundedCoinChange3 {
    public static int MinCoin(int[] nums, int sum)
    {
        if(sum ==0){
            return 0;
        }
        int n = nums.length;
        if(n ==0){
            return Integer.MAX_VALUE;
        }
        int[][] dp = new int[n+1][sum+1];
      for(int i =0;i<=n;i++){
           dp[i][0] =0;
        }
       for(int j = 1;j<=sum;j++){
        dp[0][j] = Integer.MAX_VALUE;
       }
       for(int i =1;i<=n;i++){
            for(int j =1;j<=sum;j++){
                if(nums[i-1]<=j){
                    int taken =dp[i][j-nums[i-1]];
                    if(taken!=Integer.MAX_VALUE){
                        taken++;
                    }
                    dp[i][j] = Math.min(taken,dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
         int  ans=dp[n][sum];
           if(ans==Integer.MAX_VALUE)
           return -1;
           
           return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5};
        int sum =11;
        int result = MinCoin(arr,sum);
        System.out.println(result);
    }
}
