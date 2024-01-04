// Given a set of integers, the task is to divide it into two sets S1 and S2 such that the absolute difference between their sums is minimum. 
// If there is a set S with n elements, then if we assume Subset1 has m elements, Subset2 must have n-m elements and the value of abs(sum(Subset1) – sum(Subset2)) should be minimum.

// Example: 

// Input:  arr[] = {1, 6, 11, 5} 
// Output: 1
// Explanation:
// Subset1 = {1, 5, 6}, sum of Subset1 = 12 
// Subset2 = {11}, sum of Subset2 = 11  
import java.util.Vector;

public class minimumSubsetDifference {
    public static void subsetSum(int[] arr,int n,int sum ,boolean[][] dp){
        dp[0][0] = true;
        for(int j =1;j<=sum;j++){
            dp[1][j] = false;
        }
        // for(int i =0;i<=n;i++){
        //                 for(int j=0;j<=sum;j++){
                           
        //                     if(i == 0){
        //                         dp[i][j] = false;
        //                     }
        //                      if(j == 0){
        //                         dp[i][j] = true;
        //                     }
        //                 }
        // }


        for(int i=1;i<=n;i++){
            for(int j =0;j<=sum;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
    }
    public static int minimumdiff(int[] arr,int n){
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        boolean[][] dp = new boolean[n+1][sum+1];
       subsetSum(arr,n,sum,dp);
        Vector<Integer> V = new Vector<>();
        for(int i = 0;i<=sum/2;i++){
            if(dp[n][i]==true){
                V.add(i);
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i =0;i<V.size();i++){
            min = Math.min(min,sum-2*V.get(i));
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr ={3, 1, 4, 2, 2, 1 };
        int n = arr.length;
        
        System.out.println("The difference is:"+minimumdiff(arr,n));
    }
}
