// Given a rod of length N inches and an array of prices, price[]. price[i] denotes the value of a piece of length i. Determine the maximum value obtainable by cutting up the rod and selling the pieces.

// Note: Consider 1-based indexing.

// Example 1:

// Input:
// N = 8
// Price[] = {1, 5, 8, 9, 10, 17, 17, 20}
// Output:
// 22
// Explanation:
// The maximum obtainable value is 22 by 
// cutting in two pieces of lengths 2 and 
// 6, i.e., 5+17=22.
/////////////////////////////////////////////////////////////////////

///Memoization

// public class unboundRodCutting{
//     public static int cutrod(int[] rod_length,int[] price,int arr_length,int N,int[][] dp){
//         if(arr_length == 0 || N ==0){
//             return 0;
//         }
//         if(dp[arr_length][N]!=-1){
//             return dp[arr_length][N];
//         }
//         if(rod_length[arr_length-1]>N){
//             return dp[arr_length][N] = cutrod(rod_length, price, arr_length-1, N, dp);
//         }else{
//             return dp[arr_length][N] = Math.max(price[arr_length-1]+cutrod(rod_length, price, arr_length, N-rod_length[arr_length-1], dp),
//                                                                  cutrod(rod_length, price, arr_length-1, N, dp));
//         }

//     }
//     public static void main(String[] args) {
//         int[] rod_length = {1,2,3,4,5,6,7,8};
//         int arr_length = rod_length.length;
//         int[] price =  {1, 5, 8, 9, 10, 17, 17, 20};
//         int N =8;
//         int[][] dp = new int[arr_length+1][N+1];
//         for(int i =0;i<=arr_length;i++){
//             for(int j =0;j<=N;j++){
//                 dp[i][j] =-1;
//             }
//         }
//         int result =cutrod(rod_length,price,arr_length,N,dp);
//         System.out.println(result);
//     }
// }
////////////////////////////////////////////////////////////////////

//Gneral sompiler method -- For all cases
// class Solution{
//     public int cutRod(int price[], int n) {
      
       
//        int[][] dp = new int[n+1][n+1];
//       dp[0][0] =1;
//       for(int j=1;j<=n;j++){
//           dp[1][j] =0;
//       }

        
//        for(int i =1;i<=n;i++){
//            for(int j =1;j<=n;j++){
//                if(i<=j){
//                    dp[i][j] = Math.max(price[i-1]+dp[i][j-i],dp[i-1][j]);
//                }else{
//                    dp[i][j] = dp[i-1][j];
//                }
//            }
//        }
//        return dp[n][n];
//     }
// }



















///////////////////////////////////////////////////////////////
//Tabulation 
// public class unboundRodCutting {
//     public static int cutrod(int[] rod_length,int[] price,int N){
//         int arr_length = rod_length.length;
//         int[][] dp = new int[arr_length+1][N+1];
//         for(int i =0;i<=arr_length;i++){
//             for(int j =0;j<=N;j++){
//                 if(i==0||j==0){
//                     dp[i][j]=0;
//                 }
//             }
//         }
//         for(int i=1;i<=arr_length;i++){
//             for(int j =1;j<=N;j++){
//                 if(rod_length[i-1]<=j){
//                     dp[i][j]= Math.max(price[i-1]+dp[i][j-rod_length[i-1]],dp[i-1][j]);
//                 }else{
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }
//         return dp[arr_length][N];
//     }
//     public static void main(String[] args) {
//         int[] rod_length = {1,2,3,4,5,6,7,8};
//         int[] price =  {1, 5, 8, 9, 10, 17, 17, 20};
//         int N =8;
//         int result =cutrod(rod_length,price,N);
//         System.out.println(result);
//     }
// }
