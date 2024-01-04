// Given an array arr[] of size N and a given difference diff, the task is to count the number of partitions that we can perform 
//such that the difference between the sum of the two subsets is equal to the given difference.

// Given a difference d, count the number of partitions in which S1 is greater than or equal to S2 and the difference S1 and S2 
// is equal to d. since the answer may be large return it modulo 109 + 7.

// Note: A partition in the array means dividing an array into two parts say S1 and S2 such that the union of S1 and S2 is equal to the original array and each element is present in only of the subsets.

// Examples:

// Input: N = 4, arr[] = [5, 2, 6, 4], diff = 3
// Output: 1
// Explanation: We can only have a single partition which is shown below:
// {5, 2} and {6, 4} such that S1 = 7 and S2 = 10 and thus the difference is 3



// //Tabulation approach:

public class countNumberOfSubsetAndGiven {
    public static int countNumberOfSubset(int[] arr,int diff){
        // int m=1000000000+7;
        // int mod = (int)(1e9+7);
        int n = arr.length;
        int sum =0;
        for(int i : arr){
            sum+=i;
        }
        int main_sum = diff + sum;
        if(main_sum % 2 ==1){
            return 0;
        }
        main_sum= main_sum/2;
        int[][] dp = new int[n+1][main_sum+1];
        // for(int i =0;i<=n;i++){
        //     dp[i][0] = 1;
        // }
        dp[0][0] = 1;
        for(int j=1;j<=main_sum;j++){
            dp[1][j] = 0;
        }
        for(int i=1;i<=n;i++){
            for(int j =0;j<=main_sum;j++){
                if(arr[i-1]<=j){
                    // dp[i][j] = (dp[i-1][j-arr[i-1]]+dp[i-1][j])%m;
                    dp[i][j] = (dp[i-1][j-arr[i-1]]+dp[i-1][j]);
                }else{
                    // dp[i][j] = dp[i-1][j]%m;
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][main_sum];
    }
    public static void main(String[] args) {
        // int[] arr ={2 ,40 ,6 ,6 ,43, 44, 10 ,32, 12 ,12 ,26 ,31, 48, 14 ,38 ,42, 25};
        int[] arr ={5, 2, 6, 4};
        int diff =3;
        System.out.println("Count:"+countNumberOfSubset(arr,diff));
    }
}



















// ////////////////////////////////////////////////////////////////////////

// // Java program for above approach
// import java.util.*;
// import java.util.Arrays;

// class GFG
// {

// static int dp[][] = new int[1001][10000];

// // Function to implement dynamic programming concept
// // to count the total number of possible ways
// static int countSubsets(int[] v, int i, int S2,
// 				int currentSum)
// {
// 	if (currentSum == S2) {
// 		return 1;
// 	}
// 	if (i >= v.length) {
// 		return 0;
// 	}
// 	if (dp[i][currentSum] != -1) {
// 		return dp[i][currentSum];
// 	}
// 	if (currentSum + v[i] > S2) {
// 		return dp[i][currentSum]
// 			= countSubsets(v, i + 1, S2, currentSum);
// 	}
// 	else {
// 		return dp[i][currentSum]
// 			= countSubsets(v, i + 1, S2,
// 							currentSum + v[i])
// 				+ countSubsets(v, i + 1, S2, currentSum);
// 	}
// }
// static int countSub(int[] vp, int N, int diff)
// {
// 	int sum = 0; // Calculating total sum
// 	for (int value : vp)
// 		sum += value;
// 	// edge cases
// 	if (sum - diff < 0 || (sum - diff) % 2 == 1) {
// 		return 0;
// 	}
// 	// let the two subsets be having sum s1, s2
// 	// s1-s2 = D, where D is the difference
// 	// s1+s2 = Sum, where Sum is total Sum
// 	// s2 = (Sum-diff)/2
// 	return countSubsets(vp, 0, (sum - diff) / 2, 0);
// }


// // Driver code
// public static void main(String[] args)
// {
// 	int N = 5;
// 	int[] arr = { 1, 2, 3, 1, 2 };
// 	int diff = 1;
// 	for(int i = 0; i <1001; i++)
// 	{
// 		for(int j = 0; j <10000; j++)
// 		{
// 			dp[i][j] = -1;
// 		}
// 	}

// 	// Function call
// 	System.out.print(countSub(arr, N, diff));
// }
// }
