// Given an array arr[] of length N and an integer target. You want to build an expression out of arr[] by adding one of the symbols ‘+‘ and ‘–‘ before each integer in arr[] and then concatenate all the integers. Return the number of different expressions that can be built, which evaluates to target.

// Example: 

// Input : N = 5, arr[] = {1, 1, 1, 1, 1}, target = 3
// Output: 5
// Explanation:
// There are 5 ways to assign symbols to
// make the sum of array be target 3.

// -1 + 1 + 1 + 1 + 1 = 3
// +1 – 1 + 1 + 1 + 1 = 3
// +1 + 1 – 1 + 1 + 1 = 3
// +1 + 1 + 1 – 1 + 1 = 3

public class targetsum {
    public static int target(int[] arr, int sum){
        int add =0;
        int n = arr.length;
        for(int i:arr){
            add+=i;
        }
        int main_sum = sum+add/2;
        int[][] dp = new int[n+1][main_sum+1];
        for(int i =0;i<=n;i++){
            dp[i][0]=1;
        }
        
        for(int i =1;i<=n;i++){
            for(int j=1;j<=main_sum;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]]+ dp[i-1][j];
                }else{
                    dp[i][j] =dp[i-1][j];
                }
            }
        }
        return dp[n][main_sum];

    }
    public static void main(String[] args) {
        int[] arr ={1,1,2,3};
        int sum =1;
        System.out.println(target(arr,sum));
    }
}
